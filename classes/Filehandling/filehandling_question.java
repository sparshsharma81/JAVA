public class filehandlingquestion{
    public static void main(String args[]){
        try{
        FileWriter writer = new FileWriter("mydetails.txt");
        writer.write("Roll number is : 2310992218");
        writer.write("Name : Sparsh sharma");;
        writer.write("Course is java");
        writer.close();
        System.out.print("Work done ...systum");

        //read a file
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            System.out.println(line);
            
        }


        //delete a file
        if(file.delete()){
            System.out.println("Delete successfully");

        }
        else{
            System.out.println("can't be deleted");
        }
    }catch(IOException e){
        System.out.println("Ghani dikkat aari se///");
        e.printStackTrace();




    }
    }
}