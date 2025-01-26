# We use slow and fast pointer technique. The meeting point will be same distance from cycle start as it is from head node so we use pointers for calculationg head node and returning
# TC: O(N)
# SC: O(1)
# Yes, this worked in leetcode

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return None
        slow, fast = head, head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                pointer1, pointer2 = head, slow
                while pointer1 != pointer2:
                    pointer1 = pointer1.next
                    pointer2 = pointer2.next
                return pointer1
        return None