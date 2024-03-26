class TreeNode(object):

    def __init__(self, val=0, left=None, right=None):

        self.val = val

        self.left = left

        self.right = right
    
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if((p.val < root.val and q.val > root.val) or (p.val > root.val and q.val < root.val)):
            return root
        
        if(root.val == p.val or root.val == q.val):
            return root
        
        if(q.val < root.val and p.val < root.val):
            return self.lowestCommonAncestor(root.left,p,q)
        
        elif (q.val > root.val and p.val > root.val):
            return self.lowestCommonAncestor(root.right, p, q)


# Test Case 1: General case
root = TreeNode(4)
p = root.left = TreeNode(3)
root.right = TreeNode(8)
q = root.left.left = TreeNode(1)
root.right.left = TreeNode(5)
root.right.right = TreeNode(9)

test1 = TreeNode()
solution1 = test1.lowestCommonAncestor(root, p, q)
print("Test Case 1: ", solution1.val)

# Test Case 2: p and q are directly under the root
root2 = TreeNode(4)
p2 = root2.left = TreeNode(5)
q2 = root2.right = TreeNode(1)

test2 = TreeNode()
solution2 = test2.lowestCommonAncestor(root2, p2, q2)
print("Test Case 2: ", solution2.val)

# Test Case 3: root is LCA, where either p or q are the root
root3 = TreeNode(200)
q3 = root3.right = TreeNode(1)

test3 = TreeNode()
solution3 = test3.lowestCommonAncestor(root3, root3, q3)
print("Test Case 3: ", solution3.val)

