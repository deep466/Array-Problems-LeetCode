public class maxSubArray{
    public static int maxSubArray(int [] nums){
        int max_sum=nums[0];
        int sum = 0;

        for (int i=0; i<nums.length; i++){

            sum = sum + nums[i];

            if (sum>max_sum){
                max_sum=sum;
            }

            if (sum < 0){ 
                sum = 0;
            }
        }

        return max_sum;
        }

        public static void main(String [] args)
        {
            // int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
               int[] nums = {5,4,-1,7,8};
            int result = maxSubArray(nums);
            System.out.println(result);

        }


    
}