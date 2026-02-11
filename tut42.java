import java.util.HashMap;

public class tut42 {

    static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[]{complement, arr[i]};
            }

            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 13;

        int[] result = twoSum(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
