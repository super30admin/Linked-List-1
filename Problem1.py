'''
Problem: Reverse a linked list
Time Complexity: O(n), where n is given elements
Space Complexity: O(1)
Did this code successfully run on Leetcode: Yes
Any problem you faced while coding this: No
Your code here along with comments explaining your approach:
        take cur, prev and temp pointer
        every time assign temp.next to prev 
        cur is always one step ahead
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        cur = head
        temp = None

        while cur:
            temp = cur
            cur = cur.next
            temp.next = prev
            prev = temp
        
        return prev