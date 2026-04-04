from typing import List, Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if p is None and q is None:
            return True

        if p is None or q is None:
            return False

        if not type(p) == TreeNode and not type(q) == TreeNode:
            return True

        if (not type(p) == TreeNode or not type(q) == TreeNode) or p.val != q.val:
            return False

        return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)

if __name__ == "__main__":
    sol = Solution()

    nodeL = TreeNode(2,4,5)
    nodeR = TreeNode(3,6,7)
    root1 = TreeNode(1,nodeL,nodeR)
    print(f"Ex 1: {sol.isSameTree(root1, root1)}")

    nodeR1 = TreeNode(3, 0,4)
    root2 = TreeNode(1, 2, nodeR1)
    print(f"Ex 2: {sol.isSameTree(root1,root2)}")
