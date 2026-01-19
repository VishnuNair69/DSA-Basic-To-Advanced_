public class tut37 {
    public static boolean isplaidrom(String s){
        if(s.length()<=1)
            return true;
        if(s.charAt(0)!=s.charAt(s.length()-1))
            return false;

        return isplaidrom(s.substring(1,s.length()-1));
    }
    public static void main(String[] args) {
        System.out.println(isplaidrom("tenet"));
    }
}
