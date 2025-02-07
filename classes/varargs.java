public class varargs {
    static void print(int... a){
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.print("---------------------");
    }
    public static void main(String[] args) {
        print(1,2,3,4,5);
        //now we are implementing varags
    }
}
