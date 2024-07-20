#Time Complexity : O(n)
#Space Complexity : O(1)
#Any problem you faced while coding this : -

#The approach is to maintain current and previous pointers and iteratively changing the links by storing the next link in a temporary storage.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev, curr = None, head

        while curr:
            nxt = curr.next
            curr.next = prev
            prev = curr
            curr = nxt

        return prev
