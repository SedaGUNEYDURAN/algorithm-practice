class Solution {
    public void sortColors(int[] nums) {
       ArrayList<Integer> right = new ArrayList<>();
		ArrayList<Integer> left = new ArrayList<>();
		ArrayList<Integer> equal = new ArrayList<>();
        
        Random rand = new Random();
        int pivot=1;//nums[rand.nextInt(nums.length)];
            for(int i:nums){
                if(pivot<i){
                    right.add(i);   
                }else if(pivot>i){
                    left.add(i);
                }else{
                    equal.add(i);
                }
            }
         int index=0;
         for(int i:left)
         nums[index++]=i;
     
       	 for(int i:equal)
         nums[index++]=i;
       
         for(int i:right)
         nums[index++]=i;
    }
}
