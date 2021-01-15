# // Time Complexity : O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if(head==None):
            return None
        fast=head
        slow=head
        flag=0
        while(fast!=None and fast.next!=None):
            fast=fast.next.next
            slow=slow.next
            if(fast==slow):
                flag=1
                break
        if(flag):
            slow=head
            while(slow!=fast):
                slow=slow.next
                fast=fast.next
                
            return slow
        return None
        
        