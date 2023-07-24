#Time Complexity: O(n)
#Space Complexity: O(1)
# Use 3 pointers and initialise current to head, prev to None, temp to head.next. Reverse the sign as we go

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        prev=None
        current=head
        temp=current.next
        while(temp):
            current.next=prev
            prev=current
            current=temp
            temp=temp.next
        current.next=prev
        return current