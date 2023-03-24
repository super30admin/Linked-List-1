# Time Complexity - O(n)
# Space Complexity - O(1)


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next : 
            return head
        prev = None
        curr = head 
        fast = head.next 
        while (fast):
            curr.next = prev 
            prev = curr 
            curr = fast
            fast = fast.next 
        curr.next = prev 

        return curr


# Using recursion 
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next : 
            return head
        end = self.reverseList(head.next)
        head.next.next = head 
        head.next = None 
        return end