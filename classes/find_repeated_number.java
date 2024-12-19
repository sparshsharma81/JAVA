class find_repeated_number{
    public static void main(String[] args) {

        int [] arr = new int[n+2];
        for(int i =0 ; i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        for(int i = 0; i<arr.length;i++){
            arr[Math.abs(arr[i])]*=-1;

        }
        for(int i= 1;i<=n;i++){
            if(arr[i] > 0){
                System.out.println(arr[i]);
            }
        }
    }
}