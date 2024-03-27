from typing import List, Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):

        self.val = val

        self.left = left

        self.right = right
    
    def levelOrder(self, root: Optional['TreeNode']) -> List[List[int]]:
        finalReturn = []
        if root == None:
            return finalReturn
        
        queue = []
        queue.append(root)

        while len(queue) > 0:
            curRow = []
            size = len(queue)
            for i in range(size):
                removed = queue.pop(0)
                if removed.left:
                    queue.append(removed.left)
                if removed.right:
                    queue.append(removed.right)
                curRow.append(removed.val)
            
            finalReturn.append(curRow)
        
        return finalReturn

# Test Case 1: Provided Test Case
root1 = TreeNode(4)
root1.left = TreeNode(3)
root1.right = TreeNode(8)
root1.left.left = TreeNode(1)
root1.right.left = TreeNode(5)
root1.right.right = TreeNode(9)

print("Test Case 1:")
print(root1.levelOrder(root1))

# Test Case 2: If the root is the only node
root2 = TreeNode(4)
print("Test Case 2:")
print(root2.levelOrder(root2))

# Test Case 3: Skewed Tree's
root3 = TreeNode(4)
root3.right = TreeNode(3)
root3.right.right = TreeNode(8)
root3.right.right.right = TreeNode(1)
root3.right.right.right.right = TreeNode(5)
root3.right.right.right.right.right = TreeNode(9)

print("Test Case 3:")
print(root3.levelOrder(root3))
