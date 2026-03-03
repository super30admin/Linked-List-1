# https://leetcode.com/problems/reverse-linked-list/

# Time Complexity: O(2n)
# Space Complexity: O(n)

# This problem implements reversing a linked list. This is one of the methods which use prev, curr and temp
# pointers to reverse the direction and move all 3 pointers one node at a time until it reaches end of the linked list
# Then finally the last node points to prev. Return the prev pointer which gives the reversed linked list
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head

        while curr is not None:
            temp = curr.next
            curr.next = prev
            prev = curr 
            curr = temp
        return prev
    
# Recursive solution for reversing linked list

class Solution:
    def reverseList(self, head):
        if head is None or head.next is None:
            return head

        re = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return re
    
# Recursion using helper function

class Solution:
    new_head = ListNode()
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None
        self.helper(head)
        return self.new_head

    def helper(self, head):
        if head.next is None:
            self.new_head = head
            return 

        self.helper(head.next)
        head.next.next = head
        head.next = None
