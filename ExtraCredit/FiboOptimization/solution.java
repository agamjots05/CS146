public class solution {
  public int fibo(int n){
    if (n == 1){
        return 0;
    }
    else if (n == 2){
        return 1;
    }
    int[] ret = new int[n];
    
    ret[0] = 0;
    ret[1] = 1;
    
    

    for (int i = 2; i < n; i++){
      ret[i] = ret[i-2] + ret[i-1];
    }

    return ret[n-1];
  }
  
  
  
  
  public static void main(String[] args) {
    solution test1 = new solution();
    System.out.println(test1.fibo(9));
  }

  
}
