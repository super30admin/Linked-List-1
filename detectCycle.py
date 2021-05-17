"""
Intuition: Make use of fast and slow pointers.
Travel 2X distance with one pointer and X distance with another pointer.
We will find that the distance to current position to the intersecting node is the same as the start to the intersecting node
#####################################################################
Time Complexity : O(N) 
Space Complexity : O(1)
#####################################################################
"""


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        # if head == None or head.next == None:
        #     return head
        fast = head
        slow = head
        foundCycle = False
        while fast != None and fast.next != None :
            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                foundCycle = True
                break
        
        if foundCycle == False:
            return None
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return fast