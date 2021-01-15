# // Time Complexity : O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if(head==None):
            return None
        dummy=ListNode(-1)
        slow=dummy
        fast=dummy
        dummy.next=head
        count=0
        while(fast!=None and fast.next!=None):
            fast=fast.next
            count+=1
            if(count>n):
                slow=slow.next
        
        slow.next=slow.next.next
        return dummy.next