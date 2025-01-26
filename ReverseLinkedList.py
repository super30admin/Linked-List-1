# Time Complexity : O(n), n is no of nodes in the given list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA 

# Your code here along with comments explaining your approach:
# using three pointers - prev, current
# current isused to traverse the linked list
# prev is used to keep a pointer one step behind, because we need to connect current to prev
# since after updating current.next we will lose the next node that we have to traverse to, we use a temp node to store that info



# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        # empty list or single node list cannot be reversed
        if head is None or head.next is None:
            return head
        # prev is none at the beggining
        current = head
        prev = None
        # main step is to connect current.next to prev
        while current is not None:
            temp = current.next
            current.next = prev
            prev = current
            current = temp
        
        # prev will be the last element in the list, that will be our new head
        head = prev
        return head