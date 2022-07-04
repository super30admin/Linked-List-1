"""
The main idea is to point from current node to the previous node. i.e. reverse the direction of all the pointers.
We maintain the next in a temp node so that it can be accessed later to change its linking

Time complexity = O(n) as we traverse through all the nodes
Space complexity = O(1) to store the temp node

"""
# Iterative
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        while curr:
            temp_next = curr.next
            curr.next = prev
            prev = curr
            curr = temp_next
            
        return prev
        
# Recursive
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # checking for last node in the list(base case)
        if not head or not head.next:
            return head
        p = self.reverseList(head.next)
        head.next.next = head
        head.next = None

        return p

