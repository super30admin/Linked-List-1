"""
time - o(n)
space - o(1)
we take three variables, current, previous and next, we basically make the current node's next as previous and for the next iteration make next as current and current as previous
we maintain a dummy node at the start to return the result
"""
from typing import Optional
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def __init__(self):
        self.new_head = None
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return head
        self.helper(head)
        return self.new_head
    
    def helper(self, head):
        if not head.next:
            self.new_head = head
            return head
        
        node = self.helper(head.next)
        node.next = head
        head.next = None
        return head

        