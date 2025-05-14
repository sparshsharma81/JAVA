//we have updated the project....

import java.util.*;

public class HostelManagementSystem {

    // ==== STUDENT (BST Node) ====
    static class Student {
        int id;
        String name;
        int roomNumber;
        Student left, right;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
            this.roomNumber = -1; // -1 means no room assigned
        }
    }

    static Student root = null; // BST root

    // ==== ROOM ALLOCATION ====
    static Map<Integer, ArrayList<Student>> roomAllocation = new HashMap<>();
    static int roomCapacity = 2; // Configurable capacity of each room

    // ==== VISITOR LOG (LinkedList) ====
    static class Visitor {
        String visitorName;
        int studentId;
        String date;

        Visitor(String visitorName, int studentId, String date) {
            this.visitorName = visitorName;
            this.studentId = studentId;
            this.date = date;
        }
    }

    static LinkedList<Visitor> visitorLogs = new LinkedList<>();

    // ==== ATTENDANCE ====
    static class Attendance {
        String date;
        boolean isPresent;

        Attendance(String date, boolean isPresent) {
            this.date = date;
            this.isPresent = isPresent;
        }
    }

    static Map<Integer, ArrayList<Attendance>> attendanceRecords = new HashMap<>();

    // ==== BST Operations ====
    static Student insertStudent(Student root, int id, String name) {
        if (root == null) return new Student(id, name);
        if (id < root.id) root.left = insertStudent(root.left, id, name);
        else if (id > root.id) root.right = insertStudent(root.right, id, name);
        return root;
    }

    static Student searchStudent(Student root, int id) {
        if (root == null || root.id == id) return root;
        if (id < root.id) return searchStudent(root.left, id);
        return searchStudent(root.right, id);
    }

    static Student deleteStudent(Student root, int id) {
        if (root == null) return root;

        if (id < root.id) root.left = deleteStudent(root.left, id);
        else if (id > root.id) root.right = deleteStudent(root.right, id);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            root.id = minValue(root.right);
            root.right = deleteStudent(root.right, root.id);
        }
        return root;
    }

    static int minValue(Student root) {
        int min = root.id;
        while (root.left != null) {
            min = root.left.id;
            root = root.left;
        }
        return min;
    }

    static void inorderDisplay(Student root) {
        if (root != null) {
            inorderDisplay(root.left);
            System.out.println("ID: " + root.id + ", Name: " + root.name + ", Room: " + root.roomNumber);
            inorderDisplay(root.right);
        }
    }

    static void allocateRoomToStudent(int id) {
        Student student = searchStudent(root, id);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        if (roomAllocation.isEmpty()) {
            System.out.println("No rooms available!");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Room Number to Allocate: ");
        int roomNumber = sc.nextInt();
        sc.nextLine();

        if (!roomAllocation.containsKey(roomNumber)) {
            roomAllocation.put(roomNumber, new ArrayList<>());
        }

        ArrayList<Student> studentsInRoom = roomAllocation.get(roomNumber);

        if (studentsInRoom.size() < roomCapacity) {
            studentsInRoom.add(student);
            student.roomNumber = roomNumber;
            System.out.println("Room " + roomNumber + " allocated to student: " + student.name);
        } else {
            System.out.println("Room " + roomNumber + " is full.");
        }
    }

    static void unallocateRoomFromStudent(int id) {
        Student student = searchStudent(root, id);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        if (student.roomNumber == -1) {
            System.out.println("Student has no room allocated.");
            return;
        }

        int roomNumber = student.roomNumber;
        roomAllocation.get(roomNumber).remove(student);
        student.roomNumber = -1;
        System.out.println("Room " + roomNumber + " unallocated from student: " + student.name);
    }

    static void removeVisitorLog(String visitorName, int studentId, String date) {
        Iterator<Visitor> iterator = visitorLogs.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Visitor v = iterator.next();
            if (v.visitorName.equals(visitorName) && v.studentId == studentId && v.date.equals(date)) {
                iterator.remove();
                found = true;
                System.out.println("Visitor log removed for Visitor: " + visitorName + ", Student ID: " + studentId + ", Date: " + date);
                break;
            }
        }

        if (!found) {
            System.out.println("No matching visitor log found.");
        }
    }

    // ✅ Fixed: Prevent marking attendance multiple times on same date
    static void markAttendance(int studentId, String date, boolean isPresent) {
        Student student = searchStudent(root, studentId);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        if (!attendanceRecords.containsKey(studentId)) {
            attendanceRecords.put(studentId, new ArrayList<>());
        }

        ArrayList<Attendance> attendanceList = attendanceRecords.get(studentId);
        for (Attendance record : attendanceList) {
            if (record.date.equals(date)) {
                System.out.println("Attendance already marked for " + student.name + " on " + date);
                return;
            }
        }

        attendanceList.add(new Attendance(date, isPresent));
        System.out.println("Attendance marked for student " + student.name + " on " + date);
    }

    static void viewAttendance(int studentId) {
        Student student = searchStudent(root, studentId);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        ArrayList<Attendance> attendanceList = attendanceRecords.get(studentId);
        if (attendanceList == null || attendanceList.isEmpty()) {
            System.out.println("No attendance records found for " + student.name);
            return;
        }

        System.out.println("Attendance records for " + student.name + ":");
        for (Attendance attendance : attendanceList) {
            System.out.println("Date: " + attendance.date + ", Present: " + (attendance.isPresent ? "Yes" : "No"));
        }
    }

    static void initializeRooms() {
        roomAllocation.put(101, new ArrayList<>());
        roomAllocation.put(102, new ArrayList<>());
        roomAllocation.put(103, new ArrayList<>());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initializeRooms();

        int choice;
        do {
            System.out.println("========= Hostel Management System =========");
            System.out.println("1. Register New Student (BST)");
            System.out.println("2. Search Student by ID (BST)");
            System.out.println("3. Update Student Information (BST)");
            System.out.println("4. Delete Student Record (BST)");
            System.out.println("5. Allocate Room to Student (Custom Room Allocation)");
            System.out.println("6. Unallocate Room from Student");
            System.out.println("7. Add Visitor Log (Linked List)");
            System.out.println("8. Remove Visitor Log");
            System.out.println("9. View Visitor Log");
            System.out.println("10. View All Students");
            System.out.println("11. Mark Attendance");
            System.out.println("12. View Attendance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    root = insertStudent(root, id, name);
                    System.out.println("Student Registered.");
                }
                case 2 -> {
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    Student s = searchStudent(root, id);
                    if (s != null) System.out.println("Found: " + s.name + " in Room " + s.roomNumber);
                    else System.out.println("Student not found.");
                }
                case 3 -> {
                    System.out.print("Enter Student ID to Update: ");
                    int id = sc.nextInt(); sc.nextLine();
                    Student s = searchStudent(root, id);
                    if (s != null) {
                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();
                        s.name = newName;
                        System.out.println("Student information updated.");
                    } else {
                        System.out.println("Student not found.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter Student ID to Delete: ");
                    int id = sc.nextInt();
                    Student s = searchStudent(root, id);
                    if (s != null) {
                        root = deleteStudent(root, id);
                        System.out.println("Student deleted.");
                    } else {
                        System.out.println("Student not found.");
                    }
                }
                case 5 -> {
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    allocateRoomToStudent(id);
                }
                case 6 -> {
                    System.out.print("Enter Student ID to Unallocate Room: ");
                    int id = sc.nextInt(); sc.nextLine();
                    unallocateRoomFromStudent(id);
                }
                case 7 -> {
                    System.out.print("Enter Visitor Name: ");
                    String visitorName = sc.nextLine();
                    System.out.print("Enter Student ID Visited: ");
                    int sid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Date: ");
                    String vdate = sc.nextLine();
                    visitorLogs.add(new Visitor(visitorName, sid, vdate));
                    System.out.println("Visitor Log Added.");
                }
                case 8 -> {
                    System.out.print("Enter Visitor Name to Remove: ");
                    String visitorName = sc.nextLine();
                    System.out.print("Enter Student ID: ");
                    int studentId = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Date (dd-mm-yyyy): ");
                    String date = sc.nextLine();
                    removeVisitorLog(visitorName, studentId, date);
                }
              case 9 -> {
                    if (visitorLogs.isEmpty()) {
                        System.out.println("No visitor logs available.");
                    } else {
                        System.out.println("Visitor Logs:");
                        for (Visitor v : visitorLogs) {
                            System.out.println("Visitor: " + v.visitorName + ", Visited ID: " + v.studentId + ", Date: " + v.date);
                        }
                    }
                }
                case 10 -> inorderDisplay(root);
                case 11 -> {
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Date (dd-mm-yyyy): ");
                    String date = sc.nextLine();
                    System.out.print("Was the student present? (yes/no): ");
                    String status = sc.nextLine().trim().toLowerCase();
                    boolean isPresent = status.equals("yes");
                    markAttendance(sid, date, isPresent);
                }
                case 12 -> {
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt(); sc.nextLine();
                    viewAttendance(sid);
                }
                case 0 -> System.out.println("Exiting Hostel Management System...");
                default -> System.out.println("Invalid choice! Try again.");
            }

            System.out.println(); // Blank line for readability
        } while (choice != 0);

        sc.close();
    }
}
