//Problem Statement

//You are given a string with consecutive repeating characters.
//Compress it by writing the character followed by its count.
//Example:
//Input  : "aaabbc"
//Output : "a3b2c1"


public class tut40 {
    public static void main(String[] args) {
        System.out.println(repChar("aaabbc"));
    }
    static String repChar(String s){
        //base condition
        if(s.length()==0){
            return "";
        }

        //First Index Of the String
        char ch = s.charAt(0);
        int count = 1;
        int i=1;
        
        //Conditon for the Call
        while(i<s.length() && s.charAt(i)==ch){
            count++;
            i++;
        }

        //Rest Of the broken String
        String rest = s.substring(i);


        //Return of the String the value
        return ch+String.valueOf(count)+repChar(rest);
        
    }
}
