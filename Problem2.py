# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Couldn't do it in one pass

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        length = 0
        node = head
        
        while node != None:
            length += 1
            node = node.next
        node = head
        
        if n == length:
            head = head.next
            return head
        a = length - n
        
        while a != 1:
            a -= 1
            node = node.next
        if node.next != None:
            node.next = node.next.next
        return head
            