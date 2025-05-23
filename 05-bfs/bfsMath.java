class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> hashMap= new HashMap();
        for(int i=0; i<nums.length;i++){
            if(hashMap.containsKey(target-nums[i])){
                Integer[] num= Arrays.stream(nums).boxed().toArray(Integer[]::new);
                int getIndex=Arrays.asList(num).indexOf(target-nums[i]);
                return new int[]{getIndex,i};
            } hashMap.put(nums[i],i);
        }
        return null;
    }
}
