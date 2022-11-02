# TC: O(n)
# SC: O(1)
# Does this code run on Leetcode: Yes
# Did you face any difficulties in coding this: No


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # creating a dummy node at the start of the linked list
        dummy = ListNode(0, head)
        left, right = dummy, head
        
        # moving the right pointer n places ahead of left pointer
        while n>0 and right:
            right = right.next
            n -=1
        # moving both the pointers now
        while right:
            left = left.next
            right = right.next
        
        # deleting the node
        left.next = left.next.next
        
        return dummy.next # we don't want to return the dummy node so we return it from the head
     