public class searchInRotatedSortedArray{

    public static int searchInRotatedSortedArray (int [] nums , int target){
     int low = 0;
     int high = nums.length-1;

     while (low <=high){

        int mid = (low + high) /2;

        if (nums[mid] == target){
            return mid;
        }

        if (nums[low]<= nums[mid]){

            if (nums[low] <= target && target <= nums[mid]){
                high = mid -1;
            }
            else {
                low = mid + 1;
            }
        }

        else{
            if (nums[mid]<=target && target <= nums[high]){
                low = mid +1;
            }
            else{
                high = mid - 1;
            }
        }
     }
     return -1;

    }

    public static void main (String [] args){

        // int [] nums = {4,5,6,7,1,2,3};
        // int target = 1;

        int [] nums = {4,5,6,7,0,1,2};
        int target = 3;

        System.out.println(searchInRotatedSortedArray(nums,target));
    }
}