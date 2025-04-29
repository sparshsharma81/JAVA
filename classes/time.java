import java.time.ZonedDateTime;
import java.time.ZoneId;
public class time{
  public static void main(String args[]){
    //noww we are using the time 
  //we can import this using java.time.zoneid package and all these types of package
      ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Time in India: " + indiaTime);

        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Time in New York: " + newYorkTime);

    //this will display the time zones...
  }
}
  
