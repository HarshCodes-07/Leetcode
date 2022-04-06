import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class TwoSums {
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(array, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int index_1 = -1,index_2=-1;
        int req = -1;
        for(int i=0;i<nums.length;i++){
            int required = target - nums[i];
            if(required == nums[i]){
                if (map.containsKey(required) && map.get(required)>1) {
                    index_1 = i;
                    req = required;
                    break;
                }
            }else {
                if (map.containsKey(required)) {
                    index_1 = i;
                    req = required;
                    break;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if (nums[i] == req && i != index_1){
                index_2 = i;
                break;
            }
        }
        return new int[]{index_1,index_2};
    }
}