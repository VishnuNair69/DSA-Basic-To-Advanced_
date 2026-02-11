class tut41{
    static int[] rotatearr(int[] arr){
        int j=0;
        int arr_1[] = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            arr_1[j++]=arr[i];
        }
        return arr_1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int[] arr_1 = rotatearr(arr);
        for(int a:arr_1){
            System.out.print(a+" ");
        }
        
        



    }
}