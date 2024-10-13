# Time Complexity = O(n) single traversal | Space Complexity = O(1)

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if head is None: return None

        dummy_node = ListNode(-1)
        dummy_node.next = head
        slow = dummy_node
        fast = dummy_node
        idx = 0
        while idx < n + 1:
            fast = fast.next
            idx += 1

        while fast != None:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next #don't need to point to null as python handles it in garbage collector
        return dummy_node.next
