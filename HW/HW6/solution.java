import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

public class solution {
  public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> ret = new LinkedList();
      Arrays.sort(nums);
      for (int i = 0; i < nums.length - 2; i++){
          if (i == 0 || (i > 0 && nums[i-1] != nums[i])){
              int low = i+1;
              int high = nums.length -1;
              int sum = 0-nums[i];
              
              while(low < high){
                  if (nums[low] + nums [high] == sum){
                      ret.add(Arrays.asList(nums[low], nums[high], nums[i]));
                      while(low < high && (nums[low+1] == nums[low])){
                          low++;
                      }
                      while(low < high && (nums[high-1] == nums[high])){
                          high--;
                      }
                      low++;
                      high--;
                  }
                  
                  else if (nums[low] + nums [high] > sum){
                      high--;
                  }
                  else{
                      low++;
                  }
              }
              
          }
      }
      return ret;
      
      
      
    }
    public void print(List<List<Integer>> ret){
          for (List<Integer> vals : ret){
              for (Integer sol : vals){
                  System.out.print(sol + " ");
              }
              System.out.println();
          }
      }
    
    public static void main(String args[]){
        solution test1 = new solution();
        int[] nums = new int[]{-5,0,5,10,-10,0};
        List<List<Integer>> sol1 = test1.threeSum(nums);
        test1.print(sol1);
        
    }
}
