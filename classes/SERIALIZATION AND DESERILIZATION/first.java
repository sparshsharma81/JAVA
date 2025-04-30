public class first{
    class Student{
        String name;
        int roll;
        public Student(String name,int roll){
            this.name = name;
            this.roll = roll;
        }
    }

    public static void main(String args){
        Student s1 = new Student("Sparsh",12345);
        try{
            //serilization of object
//for sterilization we will convert it to file
ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("example.txt"));
oos.writeObject(s1);

//ye file bytestream me convert ho gayi..
//ek file ban gyi..byte stream.r 

            //deserialization of objects
ObjectOutputStream ois = ObjectInputStream(new FileInputStream("lecture.txt"));
Student s2 = (Student)ois.readObject();
ois.readObject();

        }
        catch (Exception e){

        }
    }
}