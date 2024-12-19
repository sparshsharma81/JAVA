class fibonacci_sereies_best_approach{
    static int fibonacci(int n){
        if(n<=1){
            return n;

        }
        else{
            int first_Term = 0;
            int second_Term = 1;
            for(int i = 1; i<=n;i++){
                int third_Term = first_Term + second_Term;
                first_Term = second_Term;
                second_Term = third_Term;
            }
            return first_Term;
            //this has 0ms run_time... best approac
        }
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        
    }
}