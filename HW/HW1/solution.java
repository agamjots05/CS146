package HW.HW1;

public class solution {
    public boolean isPalidrome(String s){
        if (s.length() == 0 || s.length() == 1){
            return true;
        }

        int size = s.length() - 1;
        if (s.charAt(0) == s.charAt(size)){
            return isPalidrome(s.substring(1, size));
        }

        return false;
    }
    public static void main(String[] args) {
        solution test1 = new solution();
        System.out.println( test1.isPalidrome("tryyrt"));
        System.out.println( test1.isPalidrome("33243"));
        System.out.println( test1.isPalidrome("12eye21"));
       
    }

    
}
