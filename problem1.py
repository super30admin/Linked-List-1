# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# take stack add all elements to the stack
# pop the stack - this will be the new head
# no while stack exists keep adding new elements

# Tc Sc - O(n) O(n)

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        stack = []
        curr = head
        if not curr: return None
        while curr != None:
            stack.append(curr)
            curr = curr.next 
        head = stack.pop()
        curr = head
        while stack:
            curr.next = stack.pop()
            curr = curr.next
            curr.next = None
        return head
            
        