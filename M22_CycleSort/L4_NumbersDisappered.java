public class L4_NumbersDisappered {
  
// Ques-3-) Leetcode 448(Medium) Find All Numbers Disappeared in an Array

/*class Solution {
  public void swap(int i,int j,int[] nums){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
  public List<Integer> findDisappearedNumbers(int[] arr) {
    List<Integer> ans = new ArrayList<>();
    int n = arr.length, i=0;
    while(i<n){
      int ele = arr[i];  // ele should be at ele-1 idx
      if(arr[i]==i+1 || ele==arr[ele-1]) i++;
      else swap(i,ele-1,arr);
    }
    for(i=0;i<n;i++){
      if(arr[i] != i+1) ans.add(i+1);
    }
    return ans;
  }
}*/


}
