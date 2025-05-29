import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;



public class filehandling1{
    public static void main(String args[]){
    //always the file handling is in try catch
     File file = new File("hello.txt");
     
    try{
       
        //this will create a new file
       file.createNewFile(); 
        FileWriter writer = new FileWriter("hello.txt");
       //this will create a new file..
       writer.write("This is the sample testing of working of file");
       writer.close();
       //you must close the file writer..
       //jab ghr me se fridge me se pani nikalte ho..to fridge band krte hai na..waise hi ise bhi band krna chahiye/..

    }
    catch(Exception e){
        e.printStackTrace();
    }
    }

    /*
     Your fridge analogy is perfect — just like:

"Pani nikal ke fridge band krna hota hai"

Likewise,

"File me likhne ke baad writer ko band karna hota hai"

Because it saves resources and flushes remaining data to the file 
     
     */



     File myfile = new File("first.txt");
     try{
        Scanner sc= new Scanner(myfile);
        while(myfile.hasNextLine()){
            String line = sc.nextLine();

            System.out.println(line);
        }
     }
     catch(Exception e){
        e.printStackTrace();
     }
}