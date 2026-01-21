//This is all the prarice sample code 
public class tutpratice {

    public static int isfact(int n){
        //base condition
        if(n==1)
            return 1;
        return n*isfact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(isfact(4));
    }
}
