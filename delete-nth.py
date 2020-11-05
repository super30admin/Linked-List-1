# Time Complexity: O(n)
# Space Complexity: O(1)
# Approach: Use a fast and slow pointer. Start by moving the fast pointer n nodes ahead of the slow pointer.
# Move both pointers till fast hits the end. Now, slow is at the n-1 th node. Delete the nth node by pointing slow.next to slow.next.next

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
        # Initialize a sentinel node to handle edge case for a single node LL
        sentinel = ListNode(-1) 
        sentinel.next = head
        slow, fast = sentinel, sentinel
        
        # Move fast ahead by n
        count = 0
        while count <= n:
            fast = fast.next
            count += 1
            
        # Move both pointers till fast hits end
        while fast:
            slow = slow.next
            fast = fast.next
        
        # Now slow is at n-1, delete the nth node...
        slow.next = slow.next.next
        return sentinel.next