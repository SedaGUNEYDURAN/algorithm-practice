public class Main {
  public static void main(String[] args) {
  int[] nums={2,4,6,8,72,213,345};
  int target=8;
  int right=nums.length-1;
  int left=0;
    System.out.println(recursive(nums,target,left,right));
  }
  
  public static int recursive(int[] nums, int target, int left,int right){
    if(left>right){
        return -1;
    }
    int index=((left+right)/2);
    int pivot=nums[index];
 	  if(pivot==target){
       return index;
    } else if(pivot>target){
       return recursive( nums, target,left,(index-1));
    } else{
       return recursive( nums,  target,(index+1),right);
    }   
  }
}
