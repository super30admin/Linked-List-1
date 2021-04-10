# Time complexity is O(n), Space complexity is O(1)
# We use three pointers to reverse the orientation of the next pointers
# At any given node we need to keep track of where we need to go next via a temp pointer.
# Where we need to point the next of our cur node, via a prev node
# and the usual suspect of cur node.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev, cur = None, head
        while cur:
            temp = cur.next
            cur.next = prev
            prev = cur
            cur = temp
        head = prev
        return head


        
