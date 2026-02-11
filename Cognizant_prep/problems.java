package Cognizant_prep;

public class problems {
    public static void main(String[] args) {

        //Problem-1
        // String s = "hello";
        // String rev = "";
        // for (int i = s.length() - 1; i >= 0; i--) {
        //     rev = rev + s.charAt(i);
        // }
        // System.out.println(rev);

        //Reverse a String
        String s = "hello";
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        System.out.println(rev);

        //Problem-2
        // int[] arr = {1, 2, 2, 3, 4, 4, 5};

        // Set<Integer> set = new LinkedHashSet<>();
        // for (int num : arr) {
        //     set.add(num);
        // }

        // System.out.println(set);


        //Problem-3
        // String s = "madam";
        // String rev = "";

        // for (int i = s.length() - 1; i >= 0; i--) {
        //     rev += s.charAt(i);
        // }

        // if (s.equals(rev))
        //     System.out.println("Palindrome");
        // else
        //     System.out.println("Not Palindrome");

        //Problem-4
        // int num = 7;
        // boolean isPrime = true;

        // if (num <= 1) isPrime = false;

        // for (int i = 2; i <= num / 2; i++) {
        //     if (num % i == 0) {
        //         isPrime = false;
        //         break;
        //     }
        // }

        // System.out.println(isPrime ? "Prime" : "Not Prime");

        //Problem-5
        // int n = 10, a = 0, b = 1;

        // for (int i = 1; i <= n; i++) {
        //     System.out.print(a + " ");
        //     int c = a + b;
        //     a = b;
        //     b = c;
        // }


        //Problem-6
        // int[] arr = {5, 2, 9, 1, 7};

        // int min = arr[0], max = arr[0];

        // for (int num : arr) {
        //     if (num > max) max = num;
        //     if (num < min) min = num;
        // }

        // System.out.println("Max: " + max);
        // System.out.println("Min: " + min);

        //Swap of the 2 numbers
        // int a = 2;
        // int b = 3;
        // a = a^b;
        // b = a^b;
        // a = a^b;
        // System.out.println(a);
        // System.out.println(b);


        //Finding the duplicates in the array..
        // int[] a = {1,2,3,2,4,1};
        // for(int i=0;i<a.length;i++){
        //     for(int j=i+1;j<a.length;j++){
        //         if(a[i]==a[j])
        //             System.out.println(a[i]);
    
}

    
    }
