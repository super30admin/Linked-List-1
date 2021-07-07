# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if head==None:
            return
        
        slow=head
        fast=head
        flag=False
        while fast!=None and fast.next!=None:
            slow=slow.next
            fast=fast.next.next
            if fast==slow:
                flag=True
                break
        if flag:
            fast=head
            while(slow!=fast):
                slow=slow.next
                fast=fast.next
            return fast
        else:
            return None
Time is O(n)
Space is O(1)
