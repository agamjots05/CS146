package HW.HW11;

public class solution {

    static void floodFillHelp(int image[][], int i, int j, int prevC, int newC) {
        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length)
            return;
        if (image[i][j] != prevC)
            return;
        image[i][j] = newC;
        floodFillHelp(image, i + 1, j, prevC, newC);
        floodFillHelp(image, i - 1, j, prevC, newC);
        floodFillHelp(image, i, j + 1, prevC, newC);
        floodFillHelp(image, i, j - 1, prevC, newC);
    }
    

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int colorP = image[sr][sc];
        floodFillHelp(image, sr,sc, colorP, color);

        return image;
 
    }

    public static void printer(int[][] array){
        for (int[] i : array){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

     //test cases
    public static void main(String[] args) {
    solution test1 = new solution();
    int[][] image = new int[][]{{0,0,0} , {0,0,0}};
    printer(test1.floodFill(image, 0,0,0));
    



    }
     
}
