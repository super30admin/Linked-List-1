# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        curr_node,prev = head,None
        while curr_node is not None:
            temp = curr_node.next
            curr_node.next = prev
            prev = curr_node
            curr_node = temp
        return prev
