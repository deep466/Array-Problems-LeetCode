import java.util.HashMap;
import java.util.Arrays;

public class twoSum{

    public static int[] twoSums(int [] nums, int target){

        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            int reqNum = target - nums[i];

            if (hm.containsKey(reqNum)){
                return new int [] {hm.get(reqNum),i};
            }
            hm.put(nums[i],i);
        }
        return null;
    }

    public static void main (String [] args){

        int [] nums = {3,2,6,4,7};
        int target = 20;

        int [] result = twoSums(nums,target);

        if (result != null){
            System.out.println(Arrays.toString(result));
        }

        else 
        {
           System.out.println("No sum found to Target value");
        }
    }
}