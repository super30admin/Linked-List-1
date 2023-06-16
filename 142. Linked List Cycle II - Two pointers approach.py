# Using two pointers approach - Floyd's Algorithm
# Time complexity : 
# Space complexity : 
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None
        flag = False
        slow = head
        fast = head
        while(fast is not None and fast.next is not None):
            slow = slow.next
            fast = fast.next.next
            if (fast==slow):
                flag = True
                break
        if flag == False:
            return None
        slow = head
        while (slow!=fast):
            slow = slow.next
            fast = fast.next
        return fast
        