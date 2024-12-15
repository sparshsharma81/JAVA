
public class recursion_factorial {
    static int fact(int a){ ///static matlab ki ye bina object call hue use ho sakta hai...
    if(a==1 || a==0){
        return 1;
    }
    else {
        return a * fact(a-1);
    }
}
    public static void main(String[] args) {
        System.out.println(fact(11));
    }
}
