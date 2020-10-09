# O(N) time and O(1) space where N is length of LL
# The approach I used here is to maintain 3 pointers to store the reference of previous node, current node and next node
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head):
        p1 = None
        p2 = head
        while p2 is not None:
            p3 = p2.next
            p2.next = p1
            p1 = p2
            p2 = p3
        return p1