
class Main {
    public static void main(String[] args) {



     ///for single character 
     /// char ch='a';
        
        System.out.println('b'-'r');
        System.out.println('b'/'a');
        System.out.println('b'+"a");
        
        
        
        int a ='a';
        int b ='b';
        System.out.println(b-a);
        
        
       
       
        int temp =1-3;
        System.out.println(temp);
        if(temp<0){
            temp =temp*-1;         #### Absolute difference
        }
        System.out.println(temp);
        
       
       
       
        easy way
        System.out.println(Math.abs(-1));     
        
}
}


You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.


class Solution {
    public int scoreOfString(String s) {
          
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
           int a = i;
           int b = i+1;
           char ab=s.charAt(a);
           char ba=s.charAt(b);
           int aascii=ab;
           int bascii=ba;
           int temp = Math.abs(aascii-bascii);
           ans =ans+temp;
           
            
        }
        
      return ans;
    }
   
    
}