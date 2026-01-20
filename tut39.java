// Problem
//Remove duplicate characters from a string using recursion, keeping the first occurrence only.
//Practice

public class tut39 {
    public static void main(String[] args) {
        //Memory acclocation
        boolean[] seen = new boolean[26];

        String s = "abbaccda";
        
        System.out.println(removeDuplicates(s, seen));
   }
    public static String removeDuplicates(String s,boolean[] seen){
        if(s.length()==0) return "";

        //Take First Char
        char ch = s.charAt(0);

        //Remaning chars
        String rest = s.substring(1);

        int idx= ch-'a';

        if(seen[idx]){
            return removeDuplicates(rest, seen);
        }
        else{
            seen[idx] = true;
            return ch+removeDuplicates(rest, seen);
        }
        
    }

}
