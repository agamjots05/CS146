class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):

        self.val = val

        self.left = left

        self.right = right

    def TreetoList(self, arr):
        if self.left:
            self.left.TreetoList(arr)
        arr.append(self.val)
        if self.right:
            self.right.TreetoList(arr)

    def isvalidBST(self):
        arr = []
        self.TreetoList(arr)
        for i in range(1, len(arr)):
            if arr[i] <= arr[i-1]:  # Check for non-decreasing order
                return False
        return True

# Test Case 1
root = TreeNode(4)
root.left = TreeNode(2)
root.right = TreeNode(6)
root.left.left = TreeNode(1)
root.left.right = TreeNode(3)
root.right.left = TreeNode(5)
root.right.right = TreeNode(7)

print("Test case 1:")
print(root.isvalidBST())  

#Test Case 2
root2 = TreeNode(1)
root2.left = TreeNode(2)
root2.right = TreeNode(8)
root2.left.left = TreeNode(3)
root2.left.right = TreeNode(4)
root2.right.left = TreeNode(5)
root2.right.right = TreeNode(6)

print("Test case 2:")
print(root2.isvalidBST())  

#Test Case 3
root3 = TreeNode(7)
root3.left = TreeNode(-1)
root3.right = TreeNode(12)
root3.left.left = TreeNode(-2)
root3.left.right = TreeNode(0)
root3.right.left = TreeNode(6)
root3.right.right = TreeNode(15)
print("Test case 3:")
print(root3.isvalidBST())  




