"""
TC:O(n)
SC:O(1)
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if (head==None):
            return None
        else:
            slow=head
            fast=head
            cycle=False
            while(fast!=None and fast.next!=None):
                fast=fast.next.next
                slow=slow.next
                if slow==fast:
                    cycle=True
                    break
            if cycle==True:
                slow=head
                while(slow!=fast):
                    slow=slow.next
                    fast=fast.next
            else:
                return None
            return slow