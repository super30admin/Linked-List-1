"""
TC:O(n)
SC:O(1)
Leetcode: Success!
Problems: The working behind the scenes on Leetcode! Does it perform append fucntion to convert list into nodes?
"""
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # Sanity Check
        if head is None:
            return head
        # assign curr to head
        curr = head
        # Initialize ( computing None <- 1) :
        prev = curr
        curr = curr.next
        # begin a new linked List for reverse elements
        prev.next = None

        # to check if the curr node has reached the end of the linked list: null point
        while (curr):
            next = curr
            curr = curr.next
            next.next = prev
            prev = next

        # return prev as prev acts like the head of the new linkedList
        return prev


s = Solution()
head = [1,2,3,4,5]

print("Reversed List: ",s.reverseList(head))
