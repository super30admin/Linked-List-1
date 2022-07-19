# Time Complexity: O(n)
# Space Complexity: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
from curses.ascii import NL


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head or n == 0:
            return head
        
        # adding dummy node at the starting to handle edge case where we have to delete first node of the list.
        dummy = ListNode(-1)
        dummy.next = head

        slow = dummy
        fast = dummy
        count = 0

        while count <= n:
            count += 1
            fast = fast.next

        while fast:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next

        return dummy.next
        



        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        # if not head:
        #     return 

        # length = 0
        # while head:
        #     head = head.next
        #     length += 1

        # length = length - n
        # for _ in range(length):
        #     head = head.next
        # head.next = head.next.next

        # return head
        
