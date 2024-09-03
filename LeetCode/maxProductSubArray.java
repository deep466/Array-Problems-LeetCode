public class maxProductSubArray{
    public static int maxProductSubArray(int [] nums){
        int max_product=nums[0];
        int sum = 1;

        for (int i=0; i<nums.length; i++){

            sum = sum * nums[i];

            if (sum>max_product){
                max_product=sum;
            }

            if (sum < 0){ 
                sum = 0;
            }
        }

        return max_product;
        }

        public static void main(String [] args)
        {
            int[] nums = {2,3,-2,4};
            //int[] nums = {-2,0,-1};
            int result = maxProductSubArray(nums);
            System.out.println(result);

        }
}