//reversing a string 

class Main {
    public static void main(String[] args) {
        String s="babu";
        String h="";
        for(int i=3; i>=0;i--){
           h=h+s.charAt(i);
            System.out.println(h);# if we add print statement here it will be given with single digitss
            //u
            //ub
            //uba
            //ubab like this 
        }
        //if we print  out side the loop it shows result at once
        //ubab
       System.out.println(h); 
    }
}


#palindrome way 1

// if the string is same even if it was reversed
to compare string in java we use (.equals)

class Main{
    public static void main(String[]args){
        String s="pananap";
        String ans="";
        ///we use (s.length) "if dont know the length of the string"
        /// we -1 as the "i" should start from the last index 
        for(int i=s.length()-1;i>=0;i--){
            ans = ans+s.charAt(i);
        }
        
        if(ans.equals(s)){
        System.out.println("yeah it's palindrome");
    }   else{
        System.out.println("nope");
    }
       
    }
}

#way 2
//if comparing the characters we can use (==) 
//but when we compare the strings we should use .equals()
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        int n = s.length();
        boolean palindrome = true;

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("yeah");
        } else {
            System.out.println("no");
        }

        scanner.close();
    }
}