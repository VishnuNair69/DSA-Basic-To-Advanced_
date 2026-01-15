//Longest Common Prefix

package Leetcode;

public class string {
    public static void main(String[] args) {
        
        // String s = "flower";
        // System.out.println(s.length()); 6

        // System.out.println(s.substring(0,2)); fl
        // System.out.println(s.charAt(0)=='f'?"true":"False"); 

        //String array
        //String[] strs = {"flower", "flow", "flight"};

        String[] strs = {"Flower","flow","flight"};
        // for(String s:strs){
        //     System.err.print(s+" ");
        //}
        // System.out.println(strs[0]); flower
        // System.out.println(strs[1]); flow
        // System.err.println(strs[2]); flight
        // String s = strs[2];
        // for(int i=0;i<s.length();i++){
        //     System.out.print(s.charAt(i)+" ");
        // }

        //Sorting the string of arrays
        // Arrays.sort(strs);
        // for(int i=0;i<strs.length;i++){
        //     System.out.println(strs[i]);
        // }
        // System.out.println(Arrays.toString(strs));

        //String to char[] array

        String s = strs[1];
        char[] arr = s.toCharArray();
        // for(String t:arr){
        //     System.err.println(t);
        // }
        for(int i=0;i<arr.length;i++){
            System.err.println(arr[i]);
        }
        StringBuilder sb = new StringBuilder();
        System.err.println(sb.append("Hello"));

    }
}
