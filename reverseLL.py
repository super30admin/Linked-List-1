# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head):

        prev = None
        curr = head

        while curr:
            next_node = curr.next   # save next node
            curr.next = prev        # reverse pointer

            prev = curr             # move prev forward
            curr = next_node        # move curr forward

        return prev

    # TC - O(n)
    # SC - O(1) because we are using pointers so no extra space