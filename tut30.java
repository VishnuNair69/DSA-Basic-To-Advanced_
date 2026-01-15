import java.util.Scanner;

class tut30{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        //converting into string form integer
        
        String s = Integer.toString(n);
        System.out.println(s);

        if (s instanceof String) 
            System.out.println("s is a String");
        else 
            System.out.println("s is NOT a String");


    }
}
