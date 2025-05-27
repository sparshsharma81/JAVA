import java.util.*;

public class project3 

    // ==== student class hai --- bst node hai.......
    static class Student {
        int id;
        String name;
        int roomNumber;
        Student left, right;   //student apne left aur right ko point kar raha hai

        Student(int id, String name) { //basic constructor
            this.id = id;
            this.name = name;
            this.roomNumber = -1; // -1 means koi kamra assign nhi hua
        }
    }

    static Student root = null; //statis root binary serach tree ka node starting point hai

    // ==== ROOM ALLOCATION ====
    static Map<Integer, ArrayList<Student>> roomAllocation = new HashMap<>(); //ye hai hashmap room allocation k lye...basically...
    //ime arraylist use hua hai...list of students jo kamre mee hai...
    static int roomCapacity = 2; //ek kamre me 2 log hoge....

    // ==== VISITOR LOG ====
    static class Visitor {
        String visitorName;
        int studentId;
        String date;
//ye basically visistor ko count krne k liye
//isme linked list ka use hua hai..kiss bacche se kon milne aaya tha
        Visitor(String visitorName, int studentId, String date) {
            this.visitorName = visitorName;
            this.studentId = studentId;
            this.date = date;
        }
    }

    static LinkedList<Visitor> visitorLogs = new LinkedList<>();

    // ==== ATTENDANCE ====
    //hashmap...for attendence....
    static class Attendance {
        String date;
        boolean isPresent;

        Attendance(String date, boolean isPresent) {
            this.date = date;
            this.isPresent = isPresent; //constrcutor...true or false/
        }
    }

    static Map<Integer, ArrayList<Attendance>> attendanceRecords = new HashMap<>();
    //has



    //SABSE PEHLE YE HAI --------- insertStudnet() --- insertion
    ///then  ----------------------- searchStudent() ---- seartion
    ///  then ----------------------- deleteStudent() -- deletion 
    /// 


    // ==== BST K OPERATIONS ====
    static Student insertStudent(Student root, int id, String name) {
        if (root == null) return new Student(id, name); //AGAR TREE EMPTY HAI..TO NAYA NODE CREATE HO JAYEGA...
        if (id < root.id) root.left = insertStudent(root.left, id, name); //SMALLER ID..GO TO LEFT.
        else if (id > root.id) root.right = insertStudent(root.right, id, name); //LARGER ID..GO TO RIGHT
        //AGAR EQUAL HAI..TO IGNORE...
        return root; 
    }

    static Student searchStudent(Student root, int id) {
        if (root == null || root.id == id) return root; //AGAR ROOT ID NULL HO YA...MATCH KR GYI HO TO RETURN ./..
        if (id < root.id) return searchStudent(root.left, id);
        return searchStudent(root.right, id);
        //BASIC RECURSSION SE SEARCH HOGA LEFT AUR RIGHT TREE ME...
    }

    static Student deleteStudent(Student root, int id) {
        if (root == null) return root; //ismka mtlb tree khali hai..user maje le raha hai..pheli fursat me nikal....

        if (id < root.id) root.left = deleteStudent(root.left, id);
        //recurrsively search hoga...
        else if (id > root.id) root.right = deleteStudent(root.right, id);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            //agar node ka sirf ek hi baccha hai..to return krdo koi bhi child...left ya right

            root.id = minValue(root.right); //
            root.right = deleteStudent(root.right, root.id); //node ko delete krne k baad uski parent directory ko thik krdega ...
        }
        return root;
    }

    static int minValue(Student root) { //ye bst me deletion k liye hota hai... 
        //when we want to delete a node with two child...

        int min = root.id;
        while (root.left != null) {
            min = root.left.id;
            root = root.left;
        }
        return min;
    }


    //////inodrder display -=--- student ko inorder me dispolay kren k liye
    /// /// allocateRoomToStudent --- kamra pakad apna aur nikal pheli fursat me...
    /// 

    static void inorderDisplay(Student root) { 
        //ab ye hai inorder display..to show student --- in order.......
        if (root != null) {
            inorderDisplay(root.left); 
            System.out.println("ID: " + root.id + ", Name: " + root.name + ", Room: " + root.roomNumber);
            inorderDisplay(root.right);
        }
    }

    static void allocateRoomToStudent(int id) {
        Student student = searchStudent(root, id);
        if (student == null) {
            //ye id se search karega...
            System.out.println("Student not found!");
            return;
        }
//basically binary serach tree me search krega..
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Room Number to Allocate: ");
        int roomNumber = sc.nextInt();
        sc.nextLine();

        if (!roomAllocation.containsKey(roomNumber)) { //basic operation hai...
            roomAllocation.put(roomNumber, new ArrayList<>());
        }

        ArrayList<Student> studentsInRoom = roomAllocation.get(roomNumber);

        if (studentsInRoom.size() < roomCapacity) {
            studentsInRoom.add(student);
            student.roomNumber = roomNumber;
            System.out.println("Room " + roomNumber + " allocated to " + student.name);
        } else {
            System.out.println("Room " + roomNumber + " is full.");
        }
    }

    static void unallocateRoomFromStudent(int id) { //--ye basically throw out kr dega baccho ko....pehli fursat me nikal...
        Student student = searchStudent(root, id); //ye simply serach krega...
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
        System.out.println("Room " + roomNumber + " unallocated from " + student.name);
    }

    static void removeVisitorLog(String visitorName, int studentId, String date) {
        Iterator<Visitor> iterator = visitorLogs.iterator(); //iterator basically search krne k liye use hota hai....
        //initilize an iterator to loop through visitorLogs as a linked list...
        boolean found = false;

        while (iterator.hasNext()) { //iterator though each visitor log...
            Visitor v = iterator.next();
            if (v.visitorName.equals(visitorName) && v.studentId == studentId && v.date.equals(date)) { //check all details visitor name, student id , visit date
                iterator.remove();
                found = true;
                System.out.println("Visitor log removed.");
                break;
            }
        }

        if (!found) {
            System.out.println("No matching visitor log found.");
        }
    }

    //real life analogy --- student are stored in searchable direcotry (bst-) = rooms are like boxes...

    static void markAttendance(int studentId, String date, boolean isPresent) {
        Student student = searchStudent(root, studentId);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        if (!attendanceRecords.containsKey(studentId)) {
            attendanceRecords.put(studentId, new ArrayList<>());
            //agar studnet ki attendece list me nhi ho..to empty list initilize kr dega...
        }

        ArrayList<Attendance> attendanceList = attendanceRecords.get(studentId); //usme baad list mil jayegi....
        for (Attendance record : attendanceList) {
            if (record.date.equals(date)) {
                System.out.println("Attendance already marked for this date.");
                return;
            }
        }

        attendanceList.add(new Attendance(date, isPresent)); //if not already mark... to present laga jayegi...
        System.out.println("Attendance marked for " + student.name);
    }

    static void viewAttendance(int studentId) { //attdence recores ko dekhne k liye...
        Student student = searchStudent(root, studentId);
        if (student == null) {
            System.out.println("Student not found!");
            return;
            //agar student nhi mila...to error msg
        }

        //agar student mil gya..to uske attendence me search kreag...

        ArrayList<Attendance> attendanceList = attendanceRecords.get(studentId);
        if (attendanceList == null || attendanceList.isEmpty()) {
            System.out.println("No attendance records for " + student.name); 
            return;
        }

        System.out.println("Attendance for " + student.name + ":");
        for (Attendance att : attendanceList) {
            System.out.println("Date: " + att.date + ", Present: " + (att.isPresent ? "Yes" : "No"));
        }
    }

    static void initializeRooms() {
        //hanara maksad ye hai ki ham kuch rooms ko phelse se hi define kar dete hai..taaki stduetn baade me entry inme le skte/..
        roomAllocation.put(101, new ArrayList<>());
        roomAllocation.put(102, new ArrayList<>());
        roomAllocation.put(103, new ArrayList<>()); //yaha pr hashmap use hua tha...
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initializeRooms();

        int choice;
        do {
            System.out.println("\n======= Hostel Management System =======");
            System.out.println("1. Register Student");
            System.out.println("2. Search Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Allocate Room");
            System.out.println("6. Unallocate Room");
            System.out.println("7. Add Visitor Log");
            System.out.println("8. Remove Visitor Log");
            System.out.println("9. View Visitor Logs");
            System.out.println("10. View All Students");
            System.out.println("11. Mark Attendance");
            System.out.println("12. View Attendance");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    root = insertStudent(root, id, name);
                    System.out.println("Student Registered.");
                }
                case 2 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    Student s = searchStudent(root, id);
                    if (s != null) System.out.println("Student: " + s.name + ", Room: " + s.roomNumber);
                    else System.out.println("Student not found.");
                }
                case 3 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    Student s = searchStudent(root, id);
                    if (s != null) {
                        System.out.print("Enter New Name: ");
                        s.name = sc.nextLine();
                        System.out.println("Student Updated.");
                    } else System.out.println("Student not found.");
                }
                case 4 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    Student s = searchStudent(root, id);
                    if (s != null) {
                        root = deleteStudent(root, id);
                        System.out.println("Student Deleted.");
                    } else System.out.println("Student not found.");
                }
                case 5 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    allocateRoomToStudent(id);
                }
                case 6 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    unallocateRoomFromStudent(id);
                }
                case 7 -> {
                    System.out.print("Enter Visitor Name: ");
                    String visitor = sc.nextLine();
                    System.out.print("Enter Student ID Visited: ");
                    int sid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Date: ");
                    String date = sc.nextLine();
                    visitorLogs.add(new Visitor(visitor, sid, date));
                    System.out.println("Visitor Log Added.");
                }
                case 8 -> {
                    System.out.print("Visitor Name: ");
                    String vname = sc.nextLine();
                    System.out.print("Student ID: ");
                    int sid = sc.nextInt(); sc.nextLine();
                    System.out.print("Date: ");
                    String vdate = sc.nextLine();
                    removeVisitorLog(vname, sid, vdate);
                }
                case 9 -> {
                    if (visitorLogs.isEmpty()) {
                        System.out.println("No visitor logs.");
                    } else {
                        for (Visitor v : visitorLogs) {
                            System.out.println("Visitor: " + v.visitorName + ", Student ID: " + v.studentId + ", Date: " + v.date);
                        }
                    }
                }
                case 10 -> {
                    System.out.println("Student List:");
                    inorderDisplay(root);
                }
                case 11 -> {
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Date: ");
                    String date = sc.nextLine();
                    System.out.print("Is Present (true/false): ");
                    boolean present = sc.nextBoolean();
                    markAttendance(sid, date, present);
                }
                case 12 -> {
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    viewAttendance(sid);
                }
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }

