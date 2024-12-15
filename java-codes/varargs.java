public class varargs {
    static int sum(int ...arr){
        int result = 0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        //varargs ---they are used when we take input of multiple integers.///
       System.out.println(sum(2,3,4,5));
        
    }
}
