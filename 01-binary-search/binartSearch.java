class Solution {
    public int search(int[] nums, int target) {
        int right=nums.length-1;
        int left=0;
        int index;
        int pivot;
     
        while(left<=right){
            index=(right+left)/2;
            pivot=nums[index];
            if(pivot==target){
                return index;
             } 
            else if(pivot>target){
                right=index-1;
            } else if(pivot<target){
                left=index+1;
            }
        }
    return -1;
    }
}
