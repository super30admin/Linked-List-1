"""Reverse LinkedList
Time Complexity -O(n) Space Complexity - O(n)
Approach - recursion"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            # for rec to finish stack should also be empty
            return head
        
        reversed_rec = self.reverseList(head.next)
        #stack.pop()
        head.next.next = head
        head.next =None
        return reversed_rec
        


"""Time Complexity - O(n)
Space O(1)
Approach -> iterative (3 pointers)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev = None
        curr = head
        while curr:
            temp = curr.next
            curr.next=prev
            prev =curr
            curr = temp
        return prev"""
        