package Labs.Lab1;

public class solution {
    public int[] twosum(int[] arr, int target){
        for(int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
        
    }
    
    public static void main(String[] args) {
        solution obj = new solution();
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] solution = obj.twosum(arr1, 3);
        for( int i = 0; i < solution.length;i++){
            System.out.println(solution[i]);
        }

        
        
    }

    
}


