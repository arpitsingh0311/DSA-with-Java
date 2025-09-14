public class L7_DuplicatesInArray {

// Ques-6-) Leetcode 442(Medium) Find All Duplicates in an Array


/*class Solution {
  public void swap(int i,int j, int[] arr){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public List<Integer> findDuplicates(int[] arr) {
    int i=0 , n=arr.length;
    List<Integer> ans = new ArrayList<>();
    while(i<n){
      int ele = arr[i]-1;
      if(arr[i]!=arr[ele]) swap(i,ele,arr);
      else i++;
    }
    for(i=0;i<n;i++){
      if(arr[i]!=i+1) ans.add(arr[i]);
    }
    return ans;
  }
}*/

}
