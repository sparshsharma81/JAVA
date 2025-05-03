public class multiply_String{
    public String add(String num1,String num2){
        // int carry =0;

        // StringBuilder st = new StringBuilder();
        // for(int i=num1.length()-1;i>0;i--){
        //     if(carry!=0){
        //         number1 +=carry;
        //     }
        //     int number1 = num1.charAt(i) - '0';
        //     int number2 = num2.charAt(i) - '0';
        //     int sum = number1 + number2;
        //     if(sum > 9){
        //         int c1 = sum % 10;
            //     sum/=10;
            //     carry = sum;
            //     sum = c1;

            // }
        //     st.append(sum);


        // }
        // return st.reverse().toString();

    
          int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
    StringBuilder st = new StringBuilder();
    while (i >= 0 || j >= 0 || carry > 0) {
        int n1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
        int n2 = j >= 0 ? num2.charAt(j--) - '0' : 0;
        int sum = n1 + n2 + carry;
        carry = sum / 10;
        st.append(sum % 10);
    }
    return st.reverse().toString();
    }
    // public String mul1(String num1,char ch1){
    //     //so first we just write the logic to multiply with one digit
    //     StringBuilder st = new StringBuilder();
    //     int carry =0;
    //     int numch = ch1 - '0';
    //     for(int i=st.length()-1;i>=0;i--){
            
    //          digit = num1.charAt(i) -'0';
    //          if(carry !=0){
    //             digit = digit + carry;
    //          }
    //         int product = digit * numch;
    //         if(product > 9){
    //             int c1 = product % 10;
    //             product/=10;
    //             carry = product;
    //             product = c1;
    //         }

    //        st.append(product);



    //     }
    //     return st.reverse().toSring();
    // }

    public String mul1(String num1, char ch1) {
    int digit2 = ch1 - '0';
    int carry = 0;
    StringBuilder st = new StringBuilder();
    for (int i = num1.length() - 1; i >= 0; i--) {
        int digit1 = num1.charAt(i) - '0';
        int product = digit1 * digit2 + carry;
        st.append(product % 10);
        carry = product / 10;
    }
    if (carry > 0) st.append(carry);
    return st.reverse().toString();
}
    public String multiply(String num1, String num2) {
        // StringBuilder st= new StringBuilder(mul1(num1,num2.charAt(0)));
        // SftringBuilder s2 = "";
        // StringBuiler st4 = new StringBuilder();
        // for(int i=0;i<num1.length();i++){
        //     for(int j=1;j<num2.length();j++){
        //         s2 = new StringBuilder(mul1(num1,num2.charAt(j)));
        //        st4 = add(st,s2);
                
        //     }
        // }
        if(num1.equals("0") || num2.equals("0")) return "0";
        int zero =0;
        String res= "0";
        for(int i = num2.length()-1;i>=0;i--){
            String proud = mul1(num1,num2.charAt(i));
            for(int z = 0;z<zero;z++){
                proud+="0";
            }
            res = add(res,proud);
            zero++;
        }
        return res;
    }
    public static void main(String args[]){
        //the upper code will just used to multiply strings

        /*
         so the basic logic we have used is that we just simply perform basic multiplication taking one full String and one characeter
         and then we just add two strings 
         and then we just follow the multipication...
         */
    }
}