//////////////////way 1//////////////
class Main{
    public static void a(String hey){
        System.out.println(hey);
    }
    public static void main(String[] args){
        String chemistry="surya";
        a(chemistry);
    }
}

//////////way 2//////////
class Main {
    public static String syam(int n,String hey){
        String s="";
        for(int i=0;i<n;i++){
            s=s+hey;
        }
          return s;
    }
    public static void main(String[] args) {
      System.out.println(syam(5,"surjyoo  "));
        // System.out.println(surya);
        
    }
}
////////for int////////
class Main{
    public static int syam(int n){
        return n*3;
    }
    public static void main(String[] args){
        System.out.println(syam(5));
    }
}
/////////ARRAy///////////////
class Main{
    public static int[] fun(){
        int arr[]={1,10,180};
        return arr;
    }
    public static void main(String[] args){
        int syam[]=fun();
        for (int i=0;i<syam.length;i++){
            System.out.println(syam[i]);
        }
    }
}


/////////for arrays////////////
class Main{
    public static int[] fun(){
        int arr[]={2,3,4,5};
        return arr;
    }
    public static void main(String[] args){
        int syam []=fun();
        for(int i=0;i<syam.length;i++){
            System.out.println(syam);
        }
        
    }
}

