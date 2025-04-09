import java.util.*;

class Student {
    int rollNumber;
    String name;
    double marks;

    Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNumber + ", Name: " + name + ", Marks: " + marks;
    }
}

public class project {
    static List<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Student Record Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search by Roll Number");
            System.out.println("4. Sort by Marks");
            System.out.println("5. Sort by Name");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> displayStudents();
                case 3 -> searchByRollNumber();
                case 4 -> sortByMarks();
                case 5 -> sortByName();
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);
    }

    static void addStudent() {
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        studentList.add(new Student(roll, name, marks));
        System.out.println("Student added successfully.");
    }

    static void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }
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
        if (!found) System.out.println("Student with roll number " + roll + " not found.");
    }

    static void sortByMarks() {
        studentList.sort(Comparator.comparingDouble(s -> s.marks));
        System.out.println("Sorted by Marks (Ascending).");
        displayStudents();
    }

    static void sortByName() {
        studentList.sort(Comparator.comparing(s -> s.name.toLowerCase()));
        System.out.println("Sorted by Name (A-Z).");
        displayStudents();
    }
} 