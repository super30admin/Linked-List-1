# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Take the linked list in stack
# Remove nth from last( l-n )
# Return first element of stack as head
# TC SC- O(n) O(n) 

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        curr = head
        stack = []
        while curr != None:
            stack.append(curr)
            curr = curr.next
        if n > len(stack):
            return None
        if len(stack) == 1:
            return None
        l = len(stack)
        if l-n == 0:
            head = stack[1]
            return head
        stack[l-n-1].next = stack[l-n].next
        return stack[0]