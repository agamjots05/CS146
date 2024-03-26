package HW.HW9;

public class solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        //These 2 If statments cover the base cases of the algorithm

        if ((p.val < root.val && q.val > root.val) || (p.val > root.val && q.val < root.val)){
            System.out.println("BASE CASE 2 REACHED");
            return root;
        }

        if(root.val == q.val || root.val == p.val){
            System.out.println("Comparison 1 REACHED");
            return root;
        }
        //This part of the code provides how to traverse recursively.
        if(p.val < root.val && q.val < root.val){
            System.out.println("Comparison 2 REACHED");
            return lowestCommonAncestor(root.left, p, q);
        }
        else if(p.val > root.val && q.val > root.val){
            System.out.println("Comparison 3 REACHED");
            return lowestCommonAncestor(root.right, p, q);
        }

        return null;

        
     }

     

     public static void main(String[] args) {

        //Test Case you provided
        TreeNode root = new TreeNode(4);
        TreeNode p = root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        TreeNode q = root.left.left = new TreeNode(1);
        //root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);
        
        solution test1 = new solution();
        
        TreeNode solution = test1.lowestCommonAncestor(root, p, q);
        System.out.println(solution.val);

        //Test Case where p and q are directly under the root
        TreeNode root3 = new TreeNode(4);
        TreeNode p3 = root3.left = new TreeNode(5);
        TreeNode q3 = root3.right = new TreeNode(1);   
        
        solution test3 = new solution();
        
        TreeNode solution3 = test3.lowestCommonAncestor(root3, p3, q3);
        System.out.println("Test Case 2: ");
        System.out.println(solution3.val);

        //Test Case where root is LCA aka where either p/q are the root.
        TreeNode root1 = new TreeNode(200);
        //TreeNode p1 = root1.left = new TreeNode(5);
        TreeNode q1 = root1.right = new TreeNode(1);
        
        solution test2 = new solution();
        
        TreeNode solution2 = test2.lowestCommonAncestor(root1, root1, q1);
        System.out.println("Test Case 3: ");
        System.out.println(solution2.val);

        
        


        
       


     }


    
}
