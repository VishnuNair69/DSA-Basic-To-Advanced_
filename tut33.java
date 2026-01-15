
public class tut33 {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Enter Size");
        // int size = scn.nextInt();

        // int[] arr = new int[size];
        // System.out.println("Enter elements");
        // for(int i=0;i<arr.length;i++){
        //     arr[i] = scn.nextInt();
        // }

        // for printing 
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        //for sum of elements
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum = sum+arr[i];
        // }
        // System.out.println("The sum of elements are "+sum);


        //Largest elements

        // int max = arr[0]; //12
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max)
        //         max = arr[i];
        // }
        // System.out.println("The largest element are "+ max);

        //Smallest Element
        // int max = arr[0]; //12
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<max)
        //         max = arr[i];
        // }
        // System.out.println("The largest element are "+ max);

        //problem for even and odd numbers

        // int count_even = 0;
        // int count_odd = 0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]%2==0){
        //         count_even++;
        //     }
        //     else{
        //         count_odd++;
        //     }
        // }
        // System.out.println("The even count is "+count_even + "The odd count is "+count_odd);


        //Element finding Or Not
        // int search = 20;
        // boolean Found = false;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==search){
        //         Found = true;
        //         break;
                
        //     }
            
        // }
        // System.out.println(Found?"Found":"Not Found");

        // Arrays.sort(arr);
        // System.out.println("Arrays After sorting");
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        //second largest element
        // System.out.println("The second largest is "+arr[arr.length-2]);

        // int[] arr = {12, 35, 1, 10, 34, 1};

        // Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]+" ");
        // }
        // System.out.print("The second largert is "+ arr[arr.length-2]);

        // int largest = Integer.MIN_VALUE;
        // int secondLargest = Integer.MIN_VALUE;
        // int thirdlagrest = Integer.MAX_VALUE;
        // System.out.println(largest);
        // System.out.println(secondLargest);
        // System.out.println(thirdlagrest);

        //Revrse an array

        // int[] arr = {1,2,3,4,5};
        // int[] arr_1=; 
        
        // int j=0;
        // for(int i=arr.length-1;i>=0;i--){
        //     arr_1[j] = arr[i];
        //     j++;
        // }


        // for(int z=0;z<arr.length;z++){
        //     System.out.print(arr[z]+" ");
            
        // }
        // System.out.println();

        // for(int z=0;z<arr_1.length;z++){
        //     System.out.print(arr_1[z]+" ");
        // }

        // System.out.println();
        // System.out.println(arr.length);
        // System.out.println(arr.length-1);


        //Copy one array into another
        // int[] arr_1 = {1,2,3,4,5};
        // int[] arr_2 =arr_1.clone();

        // for(int i=0;i<arr_2.length;i++){
        //     System.out.print(arr_2[i]+" ");
        // }



        //Count positive zero and negative
        // int[] arr = {1,2,-3,33,-42,-69,0,6,0,0,};
        // int positive_count=0;
        // int negative_count=0;
        // int zero_count=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>0){
        //         positive_count++;
        //     }
        //     else if(arr[i]==0){
        //         zero_count++;
        //     }
        //     else{
        //         negative_count++;
        //     }
        // }
        // System.out.println("Positive Count "+positive_count);
        // System.out.println("Negative Count "+negative_count);
        // System.out.println("Zero Count "+zero_count);

        //looping through array for-each loop

        // int[] arr = {1,2,3,4,5,6};
        // for(int print:arr){
        //     System.out.print(print+" ");
        // }

        //Remove an element from an array
        // int[] arr = {1,2,3,4,5,6,6};
        // int value_to_remove = 6;
        // int count=0;
        // for(int x:arr){
        //     if(x==value_to_remove) count++;
        // }

        //create new array
        // int[] new_array = new int[arr.length-count];

        // for(int i=0,j=0;i<arr.length;i++){
        //     if(arr[i]!=value_to_remove){
        //         new_array[j]=arr[i];
        //         j++;
        //     }
        // }

        //printing new and orginal array
        // for(int oldarr:arr){
        //     System.out.print(oldarr+" ");
        // }
        // System.err.println();
        // for(int newarr:new_array){
        //     System.out.print(newarr+" ");
        // }
        

        //{1,2,2,3,3,4}
        //count=4


        //append zero to end
        //{0,0,0,1,2,3,4}    {1,2,3,4,0,0,0}
        //create new array of same size
        //traverse each element 
        //if arr[i]!=0{new_arr[j]=arr[i]}
        //else arr[arr.length-1]

        // int[] arr = {1,0,2,0,3};
        // int[] arr_new = new int[arr.length];
        
        //traverse
        // for(int i=0,j=0;i<arr.length;i++){
        //     if(arr[i]!=0){
        //         arr_new[j] = arr[i];
        //         j++;
        //     }
        
        // }

        //print
        // for(int j:arr_new){
        //     System.out.print(j+" ");
        // }

        //Merge two array
        //{1,2,3,4,5,6}
        int[] arr_1 = {1,2,3};
        int[] arr_2 = {4,5,6};
        int[] arr_3 = new int[arr_1.length+arr_2.length];

        
        for(int i=0;i<arr_1.length;i++){
            arr_3[i]=arr_1[i];
            
        }
        for(int j=0;j<arr_2.length;j++){
            arr_3[arr_1.length+j]=arr_2[j];
        }

        //printing
        for(int p:arr_3){
            System.out.print(p+" ");
        }
    }
}
