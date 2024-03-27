package HW.HW10;


import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> solution = new ArrayList<>();
        if(root == null){
            return solution;
        }
        Queue<TreeNode> cur = new LinkedList<>();
        cur.add(root);
        while(cur.size() != 0){
            List<Integer> curRow = new ArrayList<>();
            int size = cur.size();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = cur.remove();
                if (curNode.left != null){
                    cur.add(curNode.left);
                }
                if (curNode.right != null){
                    cur.add(curNode.right);
                }
                curRow.add(curNode.val);
            }
            solution.add(curRow);
        }

        return solution;
        
    }
    public void printSolution(List<List<Integer>> solution) {
        for (List<Integer> list : solution) {
            for (Integer num : list) {
                System.out.print(num + " ");
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {

        //Test Case 1: Provided Test Case
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);

        solution test1 = new solution();
        List<List<Integer>> sol1 = test1.levelOrder(root);
        test1.printSolution(sol1);

        //Test Case 2: If the root is the only node
        TreeNode root2 = new TreeNode(4);
        solution test2 = new solution();
        List<List<Integer>> sol2 = test2.levelOrder(root2);
        System.out.println("Test 2: ");
        test1.printSolution(sol2);

        //Test Case 3: Skewed Tree's
        TreeNode root3 = new TreeNode(4);
        root3.right = new TreeNode(3);
        root3.right = new TreeNode(8);
        root3.right.right = new TreeNode(1);
        root3.right.right.right = new TreeNode(5);
        root3.right.right.right.right = new TreeNode(9);

        solution test3 = new solution();
        List<List<Integer>> sol3 = test3.levelOrder(root3);
        System.out.println("Test 3: ");
        test3.printSolution(sol3);
        

    }
}




