public class enum {
    enum Day{
        Monday,Tuesday,Wednesday,Thursday,friday,saturday,sunday;
}
enum Status{
    Success(200,"Everything is working");
    NotFound(404,"Things are not working");
    Websitenotfound(204,"Website not found");
    private int Code;
    private String msg;

    private Status(int Code, String msg){
        this.Code = Code;
        this.msg = msg;

    }
    public int getStatusCode(){
        return this.Code;
    }
    public String getStatusMsg(){
        return this.msg;
    }
}


    public interface abc{

    }
    public static void main(String args[]){
        //enums ---- they are used to store constants 
        //objects can't be modified
        //enum is a short data type which are used to define a fixed set of contraints/.
        //like monday,tuesday,wednesday,thrusday,friday,saturday


        Day d = Day.Monday;

        //to improve readability and maintainability
        Status s = Status.NotFound;
        System.err.println(s.name() + " || " + s.getStatusMsg()+" || " + s.getStatusCode());


    }
}
