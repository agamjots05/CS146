
package ExtraCredit.EEAAO;

import java.util.ArrayList;

public class solution {
    //Converting From matrix to List

    public ArrayList<ArrayList<Integer>> matrixToList(int[][] arr){
        
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < arr.length; i++) { 
            ret.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0){
                    ret.get(i).add(j);
                }
            }
        }

        return ret;
    }

    //Converting From List to 2d Matrix

    public int[][] listToMatrix(ArrayList<ArrayList<Integer>> arr){
        int[][] ret = new int[arr.size()][arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            for (Integer val : arr.get(i)) {
                ret[i][val] = 1;
            }
            
        }
         
        return ret;
    }

    //Reversing Directional Graph.
    public static ArrayList<ArrayList<Integer>> reverse(ArrayList<ArrayList<Integer>> arr){
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < arr.size(); i++) {
            ret.add(new ArrayList<Integer>());
        }

        //Reversing Operation.
        for (int i = 0; i < arr.size(); i++) {
            for (Integer val : arr.get(i)) {
                ret.get(val).add(i);
            }
        }

        return ret;

    }

    //Displaying the listToMatrix 
    public static void printMatrix(int[][] adj){
        for (int[] i : adj){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //Displying matrixToList
    public static void printList(ArrayList<ArrayList<Integer>> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.print("Node " + i + " has vertices: ");
            for (Integer val : arr.get(i)) {
                System.out.print(val + " ");
            }
            System.out.println();
            
        }
    }


    //testCases
    public static void main(String[] args) {

        //TestCase for Matrix To List
        solution test1 = new solution();
        ArrayList<ArrayList<Integer>> sol = test1.matrixToList(new int[][]{
            {0,1,1}, {1,0,1}, {1,1,0}
        });
        printList(sol);


        //Test Case for List to Matrix
        ArrayList<ArrayList<Integer>> case1 = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> adj1 = new ArrayList<Integer>();
        adj1.add(1);
        //adj1.add(2);
        case1.add(adj1);

        ArrayList<Integer> adj2 = new ArrayList<Integer>();
        adj2.add(0);
        adj2.add(2);
        case1.add(adj2);

        ArrayList<Integer> adj3 = new ArrayList<Integer>();
        adj3.add(0);
        adj3.add(1);
        case1.add(adj3);
        
        

        int[][] sol2 = test1.listToMatrix(case1);
        printMatrix(sol2);

        
        //Test Case to Reverse Directional graph.
        ArrayList<ArrayList<Integer>> case5 = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> adj6 = new ArrayList<Integer>();
        adj6.add(1);
        adj6.add(2);
        case5.add(adj6);

        ArrayList<Integer> adj7 = new ArrayList<Integer>();
        adj7.add(0);
        adj7.add(2);
        case5.add(adj7);

        ArrayList<Integer> adj8 = new ArrayList<Integer>();
        adj8.add(0);
        adj8.add(1);
        case5.add(adj8);

        printList(reverse(case5));

        



    }
    
}
