public class L6_SetMismatch {

// Quees-5-) Leetcode 645(Easy) Set Mismatch  


/*class Solution {
  public void swap(int i,int j,int[] nums){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
  public int[] findErrorNums(int[] arr) {
    int i=0, n= arr.length;
    while(i<n){
      int ele = arr[i]-1;
      if(arr[i]!=arr[ele]) swap(i,ele,arr);
      else i++;
    }
    int d=-1,m=-1;
    for(i=0;i<n;i++){
      if(arr[i]!=i+1){
        d=arr[i];
        m=i+1;
      }
    }
    return new int[]{d,m};
  }
}*/



}
