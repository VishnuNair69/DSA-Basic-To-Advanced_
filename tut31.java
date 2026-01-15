

class tut31{

    public int squarenumber(int no){
        int res = no*no;
        return res;
    }

    static void show(){
        System.out.println("Hi form show method");
    }
    void show1(){
        System.out.println("Hi from Instance method");
    }

    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        tut31 t = new tut31();
        // System.out.println("The square is  "+ t.squarenumber(n));
        show();
        t.show1();
    }
}