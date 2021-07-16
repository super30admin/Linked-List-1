# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if (head==None or head.next==None):
            return None
        slow=head
        fast=head
        
        while(fast!=None and fast.next!=None):
            
            slow=slow.next
            fast=fast.next.next
            if (slow==fast):
                
                break;
        slow=head
        print(fast,slow)
        if (fast==None or fast.next==None):
            return None
        while(slow!=fast):
            slow=slow.next
            fast=fast.next
                
        return slow
        
       #Time O(n)
       #Space O(1)
