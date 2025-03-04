public class genrics {
    class Pair<K,V>{
        K key;
        V val;
        Pair(K key, V val){
            this.key = key;
            this.val = val;
        }
    }
    class A<T> implements example<T>{
        private T key;
        public void setKey(T key){
            this.key = key;

        }
        public T getKey(){
            return this.key;        
        }
    }
    static <T>void print(T[] arr){
        for(T element:arr){
            System.out.println(element+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        /*
         genrics ---
         classes or interface or method which works for different datatypes
         */
        pair<String,Integer> p1 = new pair<>()("Jai",1);
        pair<String,String>p2 = new pair<>()("abc","abcdfg");
        Integer[] arr1 = {1,2,3,4};
        String[] arr2 = {"Jai","Satyam"};
        normalClass.print(arr1);
        normalClass.print(arr2);
    }
}
