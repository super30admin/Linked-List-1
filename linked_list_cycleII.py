# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

#time comlexity: O(n)
#space complexity: O(1)

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head==None: return head
        slow=head
        fast=head
        hascycle=False
        
        while(fast!=None and fast.next!=None):
            slow=slow.next
            fast=fast.next.next
            if slow==fast:
                hascycle=True
                break
            
        if not hascycle:
            return None
        else:
            slow=head
            while(slow!=fast):
                slow=slow.next
                fast=fast.next
            return slow