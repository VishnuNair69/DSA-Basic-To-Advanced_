public class tut35 {
    int max(int a,int b){
        if(a>b) return a;
        else return b;
    }
    static int maxD(int a,int b){
        if(a>b) return a;
        else return b;
    }
    public static void main(String[] args) {
        tut35 t = new tut35();
        System.out.println(t.max(100, 200));
        System.out.println(maxD(300, 600));
    }
}
