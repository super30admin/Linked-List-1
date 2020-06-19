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
    """
    RECURSIVE
    time : o(n)
    space : o(n), stack
    """


    def reverseList(self, head: ListNode) -> ListNode:
        
        #base
        if head == None or head.next == None:
            return head
        
        r = self.reverseList(head.next) #will always be the last node, which will be the head for the reversed list

        head.next.next = head #reversing the link
        head.next = None 
        
        return r
        
        
        """
        Iterative
        Time complexity : o(n)
        Space: O(1)
        
        if not head:
            return None
        prev = None #using 3 pointers 
        cur = head
        fast = cur.next
        
        while fast:
            cur.next = prev #reversing the link
            prev = cur moving to the next node
            cur = fast
            fast = fast.next
            
        cur.next = prev #reversing the last link
        return cur
        """