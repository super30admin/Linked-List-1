# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

'''// Time Complexity :O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : 

// Your code here along with comments explaining your approach
update the fast pointer by n times 
then run slow and fast together --- fast will point to nth node from last 
'''
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        dummy=ListNode(0)
        dummy.next=head
        slow=dummy
        fast=dummy
        
        while(n!=0):
            fast=fast.next
            n-=1
            
        while(fast!=None and fast.next!=None):
            
            slow=slow.next
            fast=fast.next
            
            
        slow.next=fast
        
        
        return dummy.next
