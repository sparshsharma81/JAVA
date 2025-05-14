//now this is the ost recent updated code
import java.util.*;

class Student {
    int id;
    String name;
    int roomNumber = -1;
    boolean isPresent = true;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Visitor {
    String visitorName;
    int studentId;
    String date;

    public Visitor(String visitorName, int studentId, String date) {
        this.visitorName = visitorName;
        this.studentId = studentId;
        this.date = date;
    }
}

class HostelManagementSystem {
    static class Node {
        Student student;
        Node left, right;

        public Node(Student student) {
            this.student = student;
        }
    }

    private Node root;
    private final Map<Integer, List<Student>> roomAllocation = new HashMap<>();
    private final LinkedList<Visitor> visitorLogs = new LinkedList<>();

    public void insertStudent(Student student) {
        root = insert(root, student);
    }

    private Node insert(Node root, Student student) {
        if (root == null) return new Node(student);
        if (student.id < root.student.id) root.left = insert(root.left, student);
        else if (student.id > root.student.id) root.right = insert(root.right, student);
        else System.out.println("Student ID already exists!");
        return root;
    }

    public void displayStudents() {
        System.out.println("List of Students:");
        inOrder(root);
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            Student s = root.student;
            System.out.println("ID: " + s.id + ", Name: " + s.name + ", Room: " + s.roomNumber + ", Present: " + s.isPresent);
            inOrder(root.right);
        }
    }

    public Student searchStudent(int id) {
        return search(root, id);
    }

    private Student search(Node root, int id) {
        if (root == null) return null;
        if (id == root.student.id) return root.student;
        else if (id < root.student.id) return search(root.left, id);
        else return search(root.right, id);
    }

    public void deleteStudent(int id) {
        Student s = searchStudent(id);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }
        if (s.roomNumber != -1) {
            roomAllocation.get(s.roomNumber).remove(s);
        }
        root = delete(root, id);
        System.out.println("Student deleted successfully.");
    }

    private Node delete(Node root, int id) {
        if (root == null) return null;
        if (id < root.student.id) root.left = delete(root.left, id);
        else if (id > root.student.id) root.right = delete(root.right, id);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            Node minNode = getMin(root.right);
            root.student = minNode.student;
            root.right = delete(root.right, minNode.student.id);
        }
        return root;
    }

    private Node getMin(Node root) {
        while (root.left != null) root = root.left;
        return root;
    }

    public void allocateRoomToStudent(int id, int roomNumber) {
        Student student = searchStudent(id);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }
        if (student.roomNumber != -1) {
            System.out.println("Student already has a room allocated (Room " + student.roomNumber + "). Unallocate first.");
            return;
        }
        roomAllocation.putIfAbsent(roomNumber, new ArrayList<>());
        roomAllocation.get(roomNumber).add(student);
        student.roomNumber = roomNumber;
        System.out.println("Room allocated successfully.");
    }

    public void unallocateRoomFromStudent(int id) {
        Student student = searchStudent(id);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }
        if (student.roomNumber != -1) {
            roomAllocation.get(student.roomNumber).remove(student);
            student.roomNumber = -1;
            System.out.println("Room unallocated successfully.");
        } else {
            System.out.println("Student doesn't have a room allocated.");
        }
    }

    public void markAttendance(int id, boolean isPresent) {
        Student student = searchStudent(id);
        if (student != null) {
            student.isPresent = isPresent;
            System.out.println("Attendance updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void addVisitorLog(String visitorName, int studentId, String date) {
        Student s = searchStudent(studentId);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }
        visitorLogs.add(new Visitor(visitorName, studentId, date));
        System.out.println("Visitor log added.");
    }

    public void viewVisitorLog() {
        if (visitorLogs.isEmpty()) {
            System.out.println("No visitor logs found.");
        } else {
            for (Visitor v : visitorLogs) {
                System.out.println("Visitor: " + v.visitorName + ", Visited ID: " + v.studentId + ", Date: " + v.date);
            }
        }
    }

    public void initializeRooms() {
        for (int i = 101; i <= 110; i++) {
            roomAllocation.putIfAbsent(i, new ArrayList<>());
        }
    }

    public static void main(String[] args) {
        HostelManagementSystem hms = new HostelManagementSystem();
        Scanner sc = new Scanner(System.in);
        hms.initializeRooms();

        while (true) {
            System.out.println("\nHostel Management System Menu");
            System.out.println("1. Insert Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Allocate Room");
            System.out.println("6. Unallocate Room");
            System.out.println("7. Mark Attendance");
            System.out.println("8. Add Visitor Log");
            System.out.println("9. View Visitor Log");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    hms.insertStudent(new Student(id, name));
                }
                case 2 -> hms.displayStudents();
                case 3 -> {
                    System.out.print("Enter ID to search: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    Student s = hms.searchStudent(id);
                    if (s != null)
                        System.out.println("ID: " + s.id + ", Name: " + s.name + ", Room: " + s.roomNumber + ", Present: " + s.isPresent);
                    else System.out.println("Student not found.");
                }
                case 4 -> {
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    hms.deleteStudent(id);
                }
                case 5 -> {
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Room Number: ");
                    int room = sc.nextInt();
                    sc.nextLine();
                    hms.allocateRoomToStudent(id, room);
                }
                case 6 -> {
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    hms.unallocateRoomFromStudent(id);
                }
                case 7 -> {
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Is present? (true/false): ");
                    boolean isPresent = sc.nextBoolean();
                    sc.nextLine();
                    hms.markAttendance(id, isPresent);
                }
                case 8 -> {
                    System.out.print("Enter Visitor Name: ");
                    String visitorName = sc.nextLine();
                    System.out.print("Enter Student ID: ");
                    int studentId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Date (YYYY-MM-DD): ");
                    String date = sc.nextLine();
                    hms.addVisitorLog(visitorName, studentId, date);
                }
                case 9 -> hms.viewVisitorLog();
                case 0 -> {
                    System.out.println("Exiting Hostel Management System. Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
