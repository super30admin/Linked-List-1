"""
Problem: Remove Nth Node From End of List
Approach: have a prev node to handle base cases when head is removed so that next to the prev node - new head can be returned.
have a guiding node that when becomes null, head pointer will be on the node to be deleted.
t.c. => O(n)
s.c. => O(1)
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        guide = head
        prev = ListNode(0, head)
        tmpPrev = prev
        tmpHead = head
        
        while n:
            guide = guide.next
            n -= 1
        
        while guide:
            tmpHead = tmpHead.next
            tmpPrev = tmpPrev.next
            guide = guide.next
        
        tmpPrev.next = tmpPrev.next.next
        return prev.next

        
