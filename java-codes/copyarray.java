class copyarray{
    public static void main(String args[]){
        int [] arr = {1,2,3,4};
        int [] arr2 = new int[4];
        arr2 = arr;
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr2[i]);
        }
    }
}