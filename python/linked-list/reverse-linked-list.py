from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None

        prev = None

        while head.next is not None:
            if prev:
                temp = head.next
                head.next = prev

                prev = head
                head = temp
            else:
                prev = head
                head = head.next
                prev.next = None

        head.next = prev
        return head


if __name__ == "__main__":
    sol = Solution()

    l1 = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))

    result = sol.reverseList(l1)

    while result:
        print(result.val, end=" -> ")
        result = result.next

    l2 = ListNode()

    print()

    result = sol.reverseList(l2)

    while result:
        print(result.val, end=" -> ")
        result = result.next
