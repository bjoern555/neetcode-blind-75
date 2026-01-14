from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def mergeTwoLists(
        self, list1: Optional[ListNode], list2: Optional[ListNode]
    ) -> Optional[ListNode]:

        if list1 is None and list2 is None:
            return None

        dummy = ListNode()
        current = dummy

        while list1 is not None and list2 is not None:
            if list1.val <= list2.val:
                current.next = list1
                list1 = list1.next
            else:
                current.next = list2
                list2 = list2.next

            current = current.next

        if list1 is not None:
            current.next = list1

        if list2 is not None:
            current.next = list2

        return dummy.next


if __name__ == "__main__":
    sol = Solution()

    l1 = ListNode(1, ListNode(2, ListNode(4)))
    l2 = ListNode(1, ListNode(3, ListNode(5)))

    result = sol.mergeTwoLists(l1, l2)

    while result:
        print(result.val, end=" -> ")
        result = result.next

    l3 = ListNode()
    l4 = ListNode(1, ListNode(2))

    print()

    result = sol.mergeTwoLists(l3, l4)

    while result:
        print(result.val, end=" -> ")
        result = result.next
