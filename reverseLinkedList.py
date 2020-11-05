#Time Complexity : O(n) where n is number of elements in the linkedlist
#Space Complexity : O(1)

#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english: Keeping a previous and current, save the current.next to a temp (so we don't lose this next element), then make the current.next point to previous, make the previous element the current and the current as the temp element. Keep iterating till there is a current node.

#Your code here along with comments explaining your approach

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev, curr = None, head
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp

        return prev
