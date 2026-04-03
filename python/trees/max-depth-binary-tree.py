from typing import List, Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        depth = 0

        if root is None:
            return depth

        if not type(root) == TreeNode:
            return depth + 1

        return max(self.maxDepth(root.left), self.maxDepth(root.right)) + 1


if __name__ == "__main__":
    sol = Solution()

    nodeL = TreeNode(2,4,5)
    nodeR = TreeNode(3,6,7)
    root1 = TreeNode(1,nodeL,nodeR)
    print(f"Ex 1: {sol.maxDepth(root1)}")

    nodeR = TreeNode(3, 0,4)
    root2 = TreeNode(1, 2, nodeR)
    print(f"Ex 2: {sol.maxDepth(root2)}")
