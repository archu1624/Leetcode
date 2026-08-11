class Solution {
    public int FirstPosition(int[] nums,int target){
       int left=0;
        int right=nums.length-1;
        int result=-1;
        while(left<=right){
        int mid=left+(right-left)/2;
        if(nums[mid]==target){
            result=mid;
            right=mid-1;
        }else if(nums[mid]<target){
             left=mid+1;
        }else{
            right=mid-1;
        }
        }
        return result;
    }
    public int LastPosition(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int result=-1;
        while(left<=right){
        int mid=left+(right-left)/2;
        if(nums[mid]==target){
            result=mid;
            left=mid+1;
        }else if(nums[mid]<target){
             left=mid+1;
        }else{
            right=mid-1;
        }
        }
        return result;
    }
        
    public int[] searchRange(int[] nums, int target) {
        int First=FirstPosition(nums,target);
        int Last=LastPosition(nums,target);
        return new int[]{First,Last};
    }
}