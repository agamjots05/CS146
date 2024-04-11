package ExtraCredit.AVLTrees;

public class solution {
    public class Node{
        private int val;
        private Node left;
        private Node right;
        private int height;

        public Node(int val){
            this.val = val;
            this.right = null;
            this.left = null;
        }

        public Node(int val, Node left, Node right){
            this.val = val;
            this.right = right;
            this.left = left;
        }

    }

    public class AVLTree{




        //Setter/Getter methods
        public int height(Node cur){
            if(cur == null){
                return -1;
            }
            else{
                return cur.height;
            }
        }

        //You want to find the maximum height between your left and right child and add 1 to it since you're looking at child node.
        public void setHeight(Node cur){
            cur.height = 1 + Math.max(height(cur.left), height(cur.right));
        }

        public int balance(Node cur){
            if (cur == null){
                return 0;
            }
            else{
                return height(cur.right) - height(cur.left);
            }
        }

        //Now we need to create the balancing helper methods. In this case it will be the left and right rotations.

        public Node rightRotation(Node cur){
            Node i = cur.left;
            Node j = i.right;
            i.right = cur;
            cur.left = j;

            setHeight(cur);
            setHeight(i);

            return i;
        }

        public Node leftRotation(Node cur){
            Node i = cur.right;
            Node j = i.left;
            i.left = cur;
            cur.right = j;
            
            setHeight(cur);
            setHeight(i);

            return i;
        }

        //Now we have the actual rebalancing method

        public Node rebalance(Node cur){
            setHeight(cur);
            int bal = balance(cur);
            if (bal > 1){
                if (height(cur.right.right) > height(cur.right.left)){
                    cur = leftRotation(cur);
                } 
                else{
                    cur.right = rightRotation(cur.right);
                    cur = leftRotation(cur);
                }
            } 
            else if (bal < -1){
                if (height(cur.left.left) > height(cur.left.right)){
                    cur = rightRotation(cur);
                }
                else {
                    cur.left = leftRotation(cur.left);
                    cur = rightRotation(cur);
                }
            }

            return cur;
        }

        public Node insertion(Node root, int val){
            if (root == null){
                return new Node(val);
            } 
            else if (root.val > val){
                root.left = insertion(root.left, val);
            } 
            else if (root.val < val){
                root.right = insertion(root.right, val);
            }
            
            return rebalance(root);
        }

        public Node deletion(Node cur, int val){
            if (cur == null){
                return cur;
            } 
            else if (cur.val > val){
                cur.left = deletion(cur.left, val);
            } 
            else if (cur.val < val){
                cur.right = deletion(cur.right, val);
            } 
            else{
                if (cur.left == null || cur.right == null){
                    if (cur.left == null){
                        cur = cur.right;
                    }
                    else{
                        cur = cur.left;
                    }
                } 
            }
            if (cur != null) {
                cur = rebalance(cur);
            }
            return cur;
        }

        //Traversal is pretty much the same as a regular BST, so in this case Ill just be using inorder traversal.

        public void traverse(Node root){
            if (root == null){
                return;
            }
            traverse(root.left);
            System.out.print(root.val + " ");
            traverse(root.right);
        }
    }


}