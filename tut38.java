//Remmove all occurances of the same charchater
//aabca
public class tut38 {

    public static String alloccurance(String s) {

        
        // Step 1 base case
        if (s.length() == 0)
            return "";

        // step 2 get first char
        char ch = s.charAt(0);

        String rest = s.substring(1);

        if (ch == "a")
            return alloccurance(rest);
        else
            return ch + alloccurance(rest);

    }

    public static void main(String[] args) {
        System.out.println(alloccurance("aabca"));
    }
}
