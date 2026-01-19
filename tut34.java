





public class tut34 {
    // static int a = 30;
    // static void hello(){
    //     System.out.println("Hello this is static method");
    // }
    //instance method
    // public int hellow(){
    //     return "hi";
    // }
    public static void main(String[] args) {
        //Star pattern problem
        //output
        //  *
        //  * * 
        //  * * *
        //  * * * *
        //  * * * * *
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }


        // for(int i=1;i<=5;i++){
        //     for(int j=5;j>=i;j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }

        //Print the elements of the array
        //for-each loop

        // int[] arr = {1,2,3,4,5};
        // for(int a:arr){
        //     System.out.println(a);
        // }

        //Print array in reverse order
        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.println(arr[i]);
        // }

        //Find the sum of all elements
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum = sum+arr[i];
        // }
        // System.out.println(sum);

        //Find the maximum element
        // int max = arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println(max);

        //Find the minimum element
        // int max = arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println(max);

        //Find second largest element
        // int[] arr = {5, 8, 2, 10};
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length-2]);


        // int[] arr = {10, 5, 20, 8};

        //very very short value ///
        // int max = Integer.MIN_VALUE;
        // int secondMax = Integer.MIN_VALUE;

        // for (int num : arr) {
        //     if (num > max) {
        //         secondMax = max;
        //         max = num;
        //     } else if (num < max && num > secondMax) {
        //         secondMax = num;
        //     }
        // }

        // System.out.println(secondMax);





        //Count even and odd numbers
        // int even_count=0;
        // int odd_count=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]%2==0) even_count++;
        //     else odd_count++;
        // }
        
        // System.out.println(even_count);
        // System.out.println(odd_count);


        //Search an element (Linear Search) Element by element O(n)
        // int[] arr = {5, 8, 2, 10};
        // int target=2;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==target) System.out.println("found at index "+(i)); 
        // }


        //     Count frequency of an element
        //     [1, 2, 2, 3, 2], element = 2
        //     Output → 3 times
        // int[] arr = {1,2,2,3,2};
        // int target = 2;
        // int count=0;
        // for(int a:arr){
        //     if(a==target) count++;
        // }
        // System.out.println(count+" times");


        // Check if array is sorted
        // [1, 2, 3, 4] → true
        // [1, 3, 2] → false

        // int[] arr = {1,2,3,4};
        // boolean flag = false;
        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]<arr[i+1]) flag = true; 
        //     else flag=false;
        // }
        // System.out.println(flag);


        // 11. Reverse array in-place
        // (No extra array)  Two Pointer problem

        // int[] arr = {1,2,3,4,5};
        //Befor
        // for(int a:arr){
        //     System.out.print(a+" ");
        // }
        // System.out.println();
        // int left = 0;
        // int right = arr.length-1;

        // while(left<right){
        //     int temp = arr[right];
        //     arr[right]= arr[left];
        //     arr[left]=temp;

        //     left++;
        //     right--;
        // }
        // for(int a:arr){
        //     System.out.print(a+" ");
        // }


        // 12. Move all zeros to the end
        // [0, 1, 0, 3, 12] → [1, 3, 12, 0, 0]

        // int[] arr= {0,1,0,3,12};
        // int[] arr_new = new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=0) {
        //         arr_new[i++]=arr[i];
                
        //     }
        // }
        // for(int a:arr_new){
        //     System.out.print(a+" ");
        // }

        

        // int[] arr = {0, 1, 0, 3, 12};

        // int j = 0; // position for non-zero
        // int i = 0;

        // // Step 1: move non-zero elements forward
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] != 0) {
        //         arr[j] = arr[i];
        //         j++;
        //     }
        // }

        // // Step 2: fill remaining with zeros
        // while (j < arr.length) {
        //     arr[j] = 0;
        //     j++;
        // }

        // // print array
        // for (int a : arr) {
        //     System.out.print(a + " ");
        // }
        ////////////////////////////////////////////
        /// 
        /// 
        // int z = 30
        // tut34 t = new tut34();
        // System.out.println(t.hashCode());
        // System.out.println(t.clone());
        // t.
        // hello();
        // System.out.println(t.hellow());




        //String
        // String s = "Hello";
        // for(int i=0;i<s.length();i++){
        //     System.out.print(s.charAt(i)+" ");
        // }   
        // System.out.println();
        // char[] ss = s.toCharArray();
        // for(int i=0;i<ss.length;i++){
        //     System.out.print(ss[i]+" ");
        // }

        //Reverse a String by using traditional method

        // String s = "Hello";

        //Convert the string into char array

        // char[] arr = s.toCharArray();

        // //Define start index and end index
        // int start = 0;
        // int end = s.length()-1;

        // //shift the array

        // while(start<end){
        //     char temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;

        //     start++;
        //     end--;
        // }

        // //print String
        // String rev = new String(arr);
        // System.out.println(rev);


        //Check Palindrome
        // String s = "Tenet";

        // int start = 0;
        // int end = s.length()-1;
        // boolean flag = false;
        // while(start<end){
        //     if(s.charAt(start)==s.charAt(end)){
        //         flag = true;
        //         break;
        //     }
        //     start++;
        //     end--;
        // }
        // if(flag==true){
        //     System.out.println("True");
        // }
        // else{
        //     System.out.println("False");
        // }


        //Check Anagram

        // String s1 = "Vishnu".toLowerCase();
        // String s2 = "Vishnu".toLowerCase();

        // //Check the length of the String
        // if(s1.length()!=s2.length()){
        //     System.out.println("False");
        //     return;
        // }
        
        // //Make array to store and makes changes 
        // int[] freq = new int[26];

        // //check string s1
        // //[1000000100011100]
        // for(int i=0;i<s1.length();i++){
        //     freq[s1.charAt(i)-'a']++;
        // }


        // //check string s2
        // //[000000000000000]
        // for(int j=0;j<s2.length();j++){
        //     freq[s2.charAt(j)-'a']--;
        // }
        
        // for(int z:freq){
        //     if(z!=0){
        //         System.out.println("false");
        //         return;
        //     }
        // }
        // System.out.println("True");



        //Longest Common Prefix Problem
        //flower flow flower ==> "fl"

        // String[] strs = {"interview", "internet", "internal"};

        // //To Append the result 
        // StringBuilder sb = new StringBuilder();

        
        // Arrays.sort(strs);

        // //Create the char Array[]
        // char[] ch1 = strs[0].toCharArray();
        // char[] ch2 = strs[strs.length-1].toCharArray();

        
        
        // //comparing the char
        // for(int i=0;i<ch1.length;i++){
        //     if(ch1[i]!=ch2[i]){
        //         break;
        //     }
        //     sb.append(ch1[i]);
        // }
        // System.out.println(sb);




        //Reverse Words in a String
        //Input:  "the sky is blue"
        //Output: "blue is sky the"

        // String s = "the sky is blue";

        // String[] s1 = s.split(" ");

        // int start = 0;
        // int end = s1.length-1;

        
        // while(start<end){
        //     String temp = s1[start];
        //     s1[start] = s1[end];
        //     s1[end] = temp;
        //     start++;
        //     end--;

        // }
        
        // for(String s2:s1){
        //     System.out.print(s2+" ");
        // }

        // String s = "the sky is blue";
        // System.out.print(s);
        // System.out.println();
        // String[] strs = s.split(" ");
        // for(String s1:strs){
        //     System.out.print(s1+" ");
        // }

        // Scanner scn = new Scanner(System.in);
        // int a = scn.nextInt();
        // String b = scn.nextLine();

        String a = "Vishnu";
        System.out.println(a.substring(0));



    }


     


        


    

}



