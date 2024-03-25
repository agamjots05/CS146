package Labs.Lab4;

public class solution {
    //Swap the left and right nodes, and recursively keep 
    public TreeNode invertTree(TreeNode root){
        if (root == null){
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void printTree(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.val + " ");
        printTree(node.left);
        printTree(node.right);
    }

    public static void main(String[] args) {
        //First test case with a full binary tree    
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println("BEFORE ANY REVERSAL");
        printTree(root);
    
        solution current = new solution();
        current.invertTree(root);

        System.out.println("After reversal ");
        printTree(root);


        //Second Test Case with a child missing from a node.
        TreeNode root2 = new TreeNode(4);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(7);
        root2.left.left = new TreeNode(5);
        root2.left.right = new TreeNode(21);
        root2.right.left = new TreeNode(3);

        System.out.println("Test Case 2: BEFORE ANY REVERSAL");
        printTree(root2);
    
        solution current2 = new solution();
        current2.invertTree(root2);

        System.out.println("Test Case 2: After reversal ");
        printTree(root2);


        //Third Test Case: Where a Node on either side has no children
        TreeNode root3 = new TreeNode(4);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(7);
        root3.left.left = new TreeNode(1);
        root3.left.right = new TreeNode(3);

        System.out.println("Test Case 3: BEFORE ANY REVERSAL");
        printTree(root3);

        solution current3 = new solution();
        current3.invertTree(root3);

        System.out.println("Test Case 3: After reversal ");
        printTree(root3);

        //Fourth Test Case: Where the tree is skewed.
        TreeNode root4 = new TreeNode(4);
        root4.left = new TreeNode(2);
        root4.left.left = new TreeNode(7);
        root4.left.left.left = new TreeNode(1);
        root4.left.left.left.left = new TreeNode(3);

        System.out.println("Test Case 4: BEFORE ANY REVERSAL");
        printTree(root4);

        solution current4 = new solution();
        current4.invertTree(root4);

        System.out.println("Test Case 4: After reversal ");
        printTree(root4);

        
         
        
    }
    
}
