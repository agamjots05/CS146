package HW.HW8;

public class solution {
    public int longestPalindrome(String s) {
        int[] chars = new int[128];
        for (char ch : s.toCharArray()){
            chars[ch]++;
        }

        int res = 0;
        for(Integer ch: chars){
            res += ch / 2 * 2;
            if(res % 2 == 0 && ch % 2 == 1){
                res+=1;
            }
        }

        return res;
    }


    public static void main(String[] args) {
        //Provided test cases
        solution test1 = new solution();
        System.out.println(test1.longestPalindrome(("abccccdd")));
        System.out.println(test1.longestPalindrome(("speediskey")));
        //Hidden Test Cases: Dealing with uppercase and lower case values
        System.out.println(test1.longestPalindrome(("AAfeiejgA"))); //Expected 5

    
    }
}
