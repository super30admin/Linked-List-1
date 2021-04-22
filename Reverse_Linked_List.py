# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        
        prev = None
        curr = head
        
        while curr:
            temp = curr.next    # Store Next
            curr.next = prev    # Link curr to prev
            prev = curr         # update prev
            curr = temp         # update curr
        
        return prev 

### Complexity Analysis ###
# Time Complexity: O(N) --> Number of nodes in the linked list
# Space Complexity: O(1) --> Constant space used by the pointers prev and current
            
            