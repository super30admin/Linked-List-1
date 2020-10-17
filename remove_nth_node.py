# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO

# Your code here along with comments explaining your approach:
# Here I create 2 pointers fast and slow. Both of them are initialised to be the Head
# Then I moved Fast ahead by N steps. after this I itreate to reach the end of the list. 
# when i reach the end of the list my slow pointer now is exactly at the Nth node from the end of the list. 
# now i skip this node and just return head 

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        slow = head
        fast = head
        
        for i in range(n):
            fast = fast.next
        
        if fast is None:       
            head = head.next
            return head
 
        while(fast.next != None):
            fast = fast.next;
            slow = slow.next;
        
        slow.next = slow.next.next
        return head
  
