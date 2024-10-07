import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class program18 {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }
        
        return 0;
    }


public static void main(String[]args){
    int nums[] = {1,2,3,4,5,6,7,8};
    System.out.println(majorityElement(nums));
}
}
