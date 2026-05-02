class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseList(self, head):
        self.newHead = None
        return self.helper(head)

    def helper(self, node):
        if not node or not node.next:
            return node
        curr = self.helper(node.next)
        node.next.next = node
        node.next = None
        return curr