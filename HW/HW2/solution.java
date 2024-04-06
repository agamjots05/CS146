package HW.HW2;

public class solution {
    public boolean isBadVersion(int val){
        //YOu can change the startBadversion variable to create test cases
        int startBadVersion = 9;
        if (val >= startBadVersion){
            return true;
        }
        return false;
    }

    public int firstVersion(int[] arr){
        int left = 0;
        int right = arr.length;

        

        while(left <= right){
            int mid = (left + right) /2;
            boolean version = isBadVersion(mid);

            if (version && mid > 0 && !isBadVersion(mid-1)){
                return mid;
            }

            else if(version){
                right = mid-1;
            }
            else{
                left = mid +1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        solution test1 = new solution();
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        System.out.println(test1.firstVersion(arr));

    }
    
}
