
public class first_n_natural_numbers {
    static void print(int s){
    int result = 0;
    for(int i = 0 ;i<=s;i++){
        result+=i;
    }
    System.out.println(result);
}
    public static void main(String[] args) {
        print(8);
    }
}
