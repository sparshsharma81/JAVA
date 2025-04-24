public class random{
    public static void main(String args[]){
        //now we are using the random

        int num = random.nextInt();


        //in the range 0 to 100
        num = random.nextInt(101);


        //in the range 50 to 100
        num = random.nextInt(51) + 50; //java ke purane compiler me
        num = random.nextInt(50,101); //java ke naye version me


        ///random otp generator
         
        int otp = random.nextInt(100000,100000);
otp =0;
for(int i=0;i<6;i++){
    otp *= 10;
    otp +=random.nextInt(9) + 1;



}
System.out.println(otp);
}