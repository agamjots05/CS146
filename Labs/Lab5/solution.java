package Labs.Lab5;

import java.util.ArrayList;

public class solution {
     ArrayList<TreeNode> arr = new ArrayList<>();

    public void TreetoArray (TreeNode current){
        if (current == null){
            return;
        }

        TreetoArray(current.left);
        arr.add(current);
        TreetoArray(current.right);
    }

    public boolean isValidBST(TreeNode root) {
        TreetoArray(root);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).val < arr.get(i-1).val){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        //Test Case 1
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        //root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);

        solution test = new solution();
        
        System.out.println("Test Case 1: " + test.isValidBST(root));



        //Test Case 2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(8);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.left = new TreeNode(5);
        root2.right.right = new TreeNode(6);
        solution test2 = new solution();
        
        System.out.println("Test Case 2: " + test2.isValidBST(root2));

        //Test Case 3: Where value on right has a value that is in the corrent position, however has a value greater than root
        TreeNode root3 = new TreeNode(7);
        root3.left = new TreeNode(-1);
        root3.right = new TreeNode(12);
        root3.left.left = new TreeNode(-2);
        root3.left.right = new TreeNode(0);
        root3.right.left = new TreeNode(6); //IMPORTANT this is what makes this false
        root3.right.right = new TreeNode(15);
        solution test3 = new solution();

        System.out.println("Test Case 3: " + test3.isValidBST(root3));


        //You can see that this array isnt sorted.
        for (TreeNode val : test3.arr) {
            System.out.print(val.val + " ,");
            
        }




    }
}

