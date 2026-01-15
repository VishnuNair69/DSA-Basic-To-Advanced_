//Recurssion in java
//It helps in solving bigger problem into smaller problems
//space complexity is more 

public class tut36 {
    public static void main(String[] args) {
       
        
        System.out.println(fibo(8));
    }
    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    
}
