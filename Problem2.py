"""
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(None)
        dummy.next = head # a dummy pointing to the head
        cur = dummy
        ct = 0
        fast = dummy
        
        while fast and ct <= n:
            fast = fast.next # place the fast pointer at n positions from beginning
            ct += 1
            
        while fast:
            fast = fast.next #iterate till the end
            cur = cur.next
            
        cur.next = cur.next.next # cur will be at the node right before the one to be removed 
        
        return dummy.next #head
        
            