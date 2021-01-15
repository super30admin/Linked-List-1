# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        """
        We can advance one pointer N times so that when that pointer reaches the end...
        the slow pointer that tags along after is the one to delete.
        """
        slow = head
        fast = head 
        
        
        for i in range(n):
            fast = fast.next 
            
        if fast == None:
            return slow.next 
        
        while fast.next:
            slow = slow.next
            fast = fast.next 
            
        slow.next = slow.next.next
        
        return head