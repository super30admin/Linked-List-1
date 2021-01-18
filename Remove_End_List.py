# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
		
		# why dummy? - Since we should not lose the reference of head node 
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0
        
		# we will stop before node which is supposed to remove
        while count <= n:
            fast = fast.next
            count += 1
         
		# will bring slow to node before node which is supposed to remove
        while fast != None:
            slow = slow.next
            fast = fast.next
        
		# discard the middle node and connect to next node
        slow.next = slow.next.next
       
		# return the dummy.next which points to head in the initial
        return dummy.next
