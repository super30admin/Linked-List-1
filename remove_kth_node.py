# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :

# We create a dummy node and point the 2 pointers to it
# Then we move the fast pointer n times
# After that we move both the pointers until fast reaches the end
# After that we just point the slow.next=sloe.next.next
#we return the dummy.next which is the head

# // Your code here along with comments explaining your approach



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy=ListNode(-1)
        dummy.next=head
        slow,fast=dummy,dummy
        count=0
        
        while count<=n:
            fast=fast.next
            count+=1
            
        while fast!=None:
            slow=slow.next
            fast=fast.next
            
        
        slow.next=slow.next.next
        
        return dummy.next