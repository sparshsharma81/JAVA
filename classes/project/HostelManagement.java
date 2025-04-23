import java.util.*;

class Student {
    int rollNumber;
    String name;
    int roomNumber;

    Student(int rollNumber, String name, int roomNumber) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNumber + ", Name: " + name + ", Room No: " + roomNumber;
    }
}

public class HostelManagement {
    static List<Student> studentList = new ArrayList<>();
    static final int ROOM_CAPACITY = 2; // Max students per room
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) { 
        int choice;
        do {
            System.out.println("\n--- Hostel Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Sort by Room Number");
            System.out.println("5. Sort by Name");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear newline
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> displayStudents();
                case 3 -> searchByRollNumber();
                case 4 -> sortByRoomNumber();
                case 5 -> sortByName();
                case 6 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }

    static void addStudent() {
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        // Check for duplicate roll number
        for (Student s : studentList) {
            if (s.rollNumber == roll) {
                System.out.println("Error: Roll number already exists.");
                return;
            }
        }

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter room number: ");
        int room = sc.nextInt();

        // Count how many students are already in this room
        long countInRoom = studentList.stream().filter(s -> s.roomNumber == room).count();
        if (countInRoom >= ROOM_CAPACITY) {
            System.out.println("Room " + room + " is already full (Capacity: " + ROOM_CAPACITY + ").");
            return;
        }

        studentList.add(new Student(roll, name, room));
        System.out.println("Student added successfully to Room " + room + ".");
    }

    static void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }
        System.out.println("\n--- List of Hostel Students ---");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    static void searchByRollNumber() {
        System.out.print("Enter roll number to search: ");
        int roll = sc.nextInt();
        boolean found = false;
        for (Student s : studentList) {
            if (s.rollNumber == roll) {
                System.out.println("Student Found: " + s);
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Student with roll number " + roll + " not found.");
    }

    static void sortByRoomNumber() {
        studentList.sort(Comparator.comparingInt(s -> s.roomNumber));
        System.out.println("Sorted by Room Number (Ascending).");
        displayStudents();
    }

    static void sortByName() {
        studentList.sort(Comparator.comparing(s -> s.name.toLowerCase()));
        System.out.println("Sorted by Name (A-Z).");
        displayStudents();
    }
}
