# Time Complexity = O(n) | Space Complexity = O(n)

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    result = ListNode()
    def reverseList(self, head: ListNode) -> ListNode:
        if head is None: return None
        self.helper(head)
        return self.result
    def helper(self, head):
        if head.next is None:
            result = head
            return

        self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return self.result

