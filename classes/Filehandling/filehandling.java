public class filehandling {
    public static void main(String[] args) {
        File file  = new File("filehandling1.java"); //basically if it does not exist..then it will create a file 
        try{

        
        if(file.createNewFile()){
            System.out.println("File created successfully");
        }
        else{
            System.out.println("File can't be created or may not exist");
        }
    }
    catch(IOException e){
        e.printStackTrace();
    }


    Filewriter writer = new FileWriter(file,true);
    
    }

}
