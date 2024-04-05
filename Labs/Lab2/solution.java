package Labs.Lab2;

import java.util.Arrays;

public class solution {
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);
        
        for (int i = 0; i < arrT.length; i++) {
            if (arrS[i] != arrT[i]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        solution test1 = new solution();
        System.out.println(test1.isAnagram("tester", "streef"));
        
    }
    
}
