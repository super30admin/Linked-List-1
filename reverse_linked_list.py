"""
Linked-List-1
Problem1 (https://leetcode.com/problems/reverse-linked-list/)

Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
Trick is to understand that we need 3 pointers, prev which points to prev node, curr points to current node, next_node points
to next node so until we reach end of list we traverse with curr and store its next in next node and set the curr to prev and 
next node to curr.
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None

        prev = None
        curr = head

        while curr is not None:
            next_node = curr.next
            curr.next = prev
            prev = curr
            curr = next_node
        
        return prev
        

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:  # recursive stack space is O(n) & trick for this is we make a cycle by doing next.next and remove the cycle by pointing it to None
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]: 
        if head is None or head.next is None:
            return head

        reversed = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return reversed
        