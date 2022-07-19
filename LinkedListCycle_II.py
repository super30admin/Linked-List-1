# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
# Time Complexity => O(N)
# Space Complexity => O(1)

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        hasCycle = False
        while(fast is not None and fast.next is not None):
            slow = slow.next
            fast = fast.next.next
            if(slow == fast):
                hasCycle = True
                break
        if(not hasCycle):
            return None
        slow = head
        while(slow is not None):
            if(slow == fast):
                return slow
            slow = slow.next
            fast = fast.next
            

        