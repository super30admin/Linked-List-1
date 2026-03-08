# problem 3 

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None
        slow = head 
        fast = head
        match_flag = False
        while(fast.next and fast.next.next):
            fast=fast.next.next 
            slow=slow.next 
            if fast == slow:
                match_flag = True 
                break
        if not match_flag:
            return None
        slow = head
        while slow!=fast:
            slow = slow.next
            fast = fast.next
        return slow