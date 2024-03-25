class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):

        self.val = val

        self.left = left

        self.right = right

    def invertTree(self):
        if self == None:
            return

        
        temp = self.left
        self.left = self.right
        self.right = temp

        
        if self.left != None:
            self.left.invertTree()
        if self.right != None:
            self.right.invertTree()


def print_tree(node):
    if node != None:
        print(node.val)
        print_tree(node.left)
        print_tree(node.right)

# Test Case 1: Regular binary tree
root1 = TreeNode(1)
root1.left = TreeNode(2)
root1.right = TreeNode(8)
root1.left.left = TreeNode(3)
root1.left.right = TreeNode(4)
root1.right.left = TreeNode(5)
root1.right.right = TreeNode(6)

print("Test Case 1: BEFORE ANY REVERSAL")
print_tree(root1)

root1.invertTree()

print("Test Case 1: After reversal ")
print_tree(root1)

# Test Case 2: Child missing from a node
root2 = TreeNode(4)
root2.left = TreeNode(2)
root2.right = TreeNode(7)
root2.left.left = TreeNode(5)
root2.left.right = TreeNode(21)
root2.right.left = TreeNode(3)

print("Test Case 2: BEFORE ANY REVERSAL")
print_tree(root2)

root2.invertTree()

print("Test Case 2: After reversal ")
print_tree(root2)

# Test Case 3: Node on either side has no children
root3 = TreeNode(4)
root3.left = TreeNode(2)
root3.right = TreeNode(7)
root3.left.left = TreeNode(1)
root3.left.right = TreeNode(3)

print("Test Case 3: BEFORE ANY REVERSAL")
print_tree(root3)

root3.invertTree()

print("Test Case 3: After reversal ")
print_tree(root3)

# Test Case 4: Skewed tree
root4 = TreeNode(4)
root4.left = TreeNode(2)
root4.left.left = TreeNode(7)
root4.left.left.left = TreeNode(1)
root4.left.left.left.left = TreeNode(3)

print("Test Case 4: BEFORE ANY REVERSAL")
print_tree(root4)

root4.invertTree()

print("Test Case 4: After reversal ")
print_tree(root4)
