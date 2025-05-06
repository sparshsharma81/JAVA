
    import java.util.*;
//hostel management systum using binary search tree, manual sorting and waiting list 
// Student class
class Student {
    int rollNumber;
    String name;
    int roomNumber;

    Student(int rollNumber, String name, int roomNumber) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.roomNumber = roomNumber;
    }
//method overriding
    @Override
    public String toString() {
        return "Roll No: " + rollNumber + ", Name: " + name + ", Room No: " + roomNumber;
    }
}

// ye node class hai..basically binary tree banaya hai search karne ke liye
class BSTNode {
    Student student;
    BSTNode left, right;

    BSTNode(Student student) {
        this.student = student;
    }
}

public class project2 {
    static LinkedList<Student> studentList = new LinkedList<>();


    //ruko jara sabar karo..in case agar room full ho..to customer enter nahi kr skta
    static Map<Integer, Queue<Student>> waitingList = new HashMap<>();


    //ye static final file hai..jo change nahi ho sakti.....
    //basically static int jo har jagah use hoga...
    static final int ROOM_CAPACITY = 2;

    //lene k liye(input)--
    static Scanner sc = new Scanner(System.in);

    
    static BSTNode root = null;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Hostel Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll Number (BST)");
            System.out.println("4. Search Student by Name (Linear Search)");
            System.out.println("5. Sort by Room Number");
            System.out.println("6. Sort by Name (Manual Bubble Sort)");
            System.out.println("7. View Waiting List");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear newline
            switch (choice) {
                case 1 -> addStudent();  //here i have used linked list, hashmap.. room capacity (static--final) , bst insertion
                case 2 -> displayStudents(); //iteration over the linked list...
                case 3 -> searchByRollNumber(); //isme binary serach tree pr traversal hoga...
                case 4 -> searchByName(); //linear search in linked list 
                case 5 -> sortByRoomNumber();//yaha pr hogi sorting..comparator se.
                case 6 -> sortByNameManual();// manual sorting using bubble sort....
                case 7 -> viewWaitingList(); //isme <queue> ke hashmap pr iterate karege
                case 8 -> System.out.println("Exiting... Thank you!"); //pehli fursat me nikal
                default -> System.out.println("Invalid choice. Please try again."); //ye default case hai..execute sirf khatarnak user ke liye hoga..
            }
        } while (choice != 8); //agar choice 8 hai to exit kar jayega
    }

    // Add a student and insert into BST
    static void addStudent() {
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();


        sc.nextLine();
        //nextint ke baad jo default bach gaya hoga..use consume kar lega..

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

        long countInRoom = studentList.stream().filter(s -> s.roomNumber == room).count();
//ye line java stream ka use kar raha hai count karne ke liye
//ye basically java stream hai joki linked list hai..use convert karega stream me
//taki ham elements pr traverse kar sakte.. -- Student object me


// .filter(s -> s.roomNumber == room):
//ye filter operation hai joki sirf certain condition true hone pr pass karega...

//.count -- ye count karega number of elements in stream and then return it

        if (countInRoom >= ROOM_CAPACITY) {

            //ye basically room capacity ko check karega..hamne queue ka bhi use kiya hai..
            System.out.println("Room " + room + " is full. Adding to waiting list...");
            waitingList.putIfAbsent(room, new LinkedList<>()); //normal funciton of hashmap
            //Concept: This is a HashMap operation.

// waitingList is a HashMap<Integer, Queue<Student>> where each room number
//  (Integer) maps to a waiting list (Queue<Student>).

            waitingList.get(room).add(new Student(roll, name, room)); //after ensureing waiting list exist..then it will add
            return;
        }

        Student newStudent = new Student(roll, name, room); 
        studentList.add(newStudent);
        insertIntoBST(newStudent); //ye binary search tree use hua hai... data insertion k liye
        System.out.println("Student added successfully to Room " + room + ".");
    }

    // Display all students
    static void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No student records found.");
            return;
            //normal functions to display and check ...
        }
        System.out.println("\n--- List of Hostel Students ---");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    // BST Insertion
    static void insertIntoBST(Student student) {
        //ye method responsibel hai data ko binary tree me insert karne ke liye 
        root = insertRec(root, student); //ye hai recurssive helper function joki insertion k liye responsible hai
    }

    static BSTNode insertRec(BSTNode root, Student student) {
        //yaha pr ham function ka creation kr rahe hai --- HELPER RECURSSIVE FUNCTION
        if (root == null) return new BSTNode(student); //binary serach tree yaha use hua hai..
        if (student.rollNumber < root.student.rollNumber)
            root.left = insertRec(root.left, student);
        else
            root.right = insertRec(root.right, student);
        return root;
    }

    // BST Search by Roll Number
    static void searchByRollNumber() {
        System.out.print("Enter roll number to search: ");
        int roll = sc.nextInt();
        Student found = searchRec(root, roll); //binary search tree --- serach karega....
        if (found != null)
            System.out.println("Student Found: " + found);
        else
            System.out.println("Student with roll number " + roll + " not found.");
    }

    static Student searchRec(BSTNode root, int roll) {
        if (root == null) return null;
        if (root.student.rollNumber == roll) return root.student;
        if (roll < root.student.rollNumber) return searchRec(root.left, roll); //binary search tree
        return searchRec(root.right, roll);
    }

    // Linear Search by Name
    static void searchByName() {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Student s : studentList) {
            if (s.name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student found with name " + name);
System.out.println("Pehli fursat me nikal");
        }
    }

    // Sort by Room Number
    static void sortByRoomNumber() {
        studentList.sort(Comparator.comparingInt(s -> s.roomNumber));
//ye hamne comparator ka use kra hai... ---basically ham constructor banke thoda aur code bada kar skte the..but we follow the standards...

        System.out.println("Sorted by Room Number (Ascending):");
        displayStudents();
    }

    // Manual Bubble Sort by Name
    static void sortByNameManual() {
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = 0; j < studentList.size() - i - 1; j++) {
                if (studentList.get(j).name.compareToIgnoreCase(studentList.get(j + 1).name) > 0) {
                    Collections.swap(studentList, j, j + 1);
                }
                //ye use hua hai bubble sort..sorting algorithmmm --- normally ye n square me jata hai

            }
        }
        System.out.println("Sorted by Name (Bubble Sort):");
        displayStudents();
    }

    // Display Room Waiting List
    static void viewWaitingList() {
        if (waitingList.isEmpty()) {
            System.out.println("No waiting lists.");
            return;
        }

        System.out.println("\n--- Waiting List by Room ---");
        for (Map.Entry<Integer, Queue<Student>> entry : waitingList.entrySet()) {
            //ham integer aur queue k hashmap pr traverse kar rahe hai...
            System.out.println("Room " + entry.getKey() + ":");
            for (Student s : entry.getValue()) {
                System.out.println("   " + s);
            }
        }
    }
}

