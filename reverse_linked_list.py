# Time Complexity :
# O(1)

# Space Complexity :
# O(1)

# Did this code successfully run on Leetcode :
#Yes

#We store 3 pointers- prev, curr and fast. Initially, prev = None, current = head and fast = head.next
#We start by pointing current's next to prev, move the prev to currrent, current to fast and fast to fast.next until fast reaches end of the linked list
#Then at the end we point the current pointer's next is pointed to prev outside the loop

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return None

        prev = None
        curr = head
        fast = head.next

        while (fast != None):
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next

        curr.next = prev
        return curr
