#Recursive:

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        
        if not head or not head.next:
            return head
        p = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        
        return p
Time : O(n)
Space : O(n)

#Iterative:

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # dummy.next = head
        if not head:
            return head
        curr = head.next
        prev = head
        
        prev.next = None
        while curr is not None:
            curr.next,prev,curr  = prev, curr, curr.next 
        return prev
Time: O(n)
Space: O(1)