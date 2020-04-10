# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

"""Single pass solution"""

# Time complexity - O(N) 
# Space complexity - O(1) 
# Approach -We create two pointers slow and fast. Move the fast pointer
#to n. Slow pointer points to next.next element, thereby deleted the node.


class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        # edge case
        if head == None:
            return None
        dummy = ListNode(0)
        dummy.next = head
        fast = slow = dummy
        count = 0        
        while count <= n:
            fast = fast.next
            count = count+1
        while fast != None:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next