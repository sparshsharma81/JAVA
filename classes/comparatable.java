public class comparatable{
    // static int keyvalue(int key,int val){

    // }

    class pair{
        int key;
        int val;
        pair(int key,int val){
            this.key = key;
            this.val = val;
        }
    @Override
    public String toString(){
        return ("key : " + key + " || value : "+ val);
    }

    }
    public static void main(String args[]){
        /*
         create a class key-value having two data members(int key, int value)
         intput a pair (array element and its frequency)
         add array element to the key value calss having array element as the key and frequency of element as the value
         
         sort the list in descending order of frequency
         */


         /*
          pair[] arr = new pair[size];
          arr[i] = new pair(key,val)



          arraylist --- 
          
          ArrayList<Pair>arrlist = new ArrayList<>();




          */

          Scanner sc= new Scanner(System.in);
          int n= sc.nextInt();
          pair[] arr = new pair[n];
          
          for(int i=0;i<n;i++){
            int key = sc.nextInt();
            int val = sc.nextInt();
            arr[i] = new pair(key,val);

          }
          //sort using lamda expression
          Arrays.sort(arr,(p1,p2)->Integer.compare(p1.val,p2.val));


    }
}