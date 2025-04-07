# This solution removes the nth node from the end of a singly-linked list using the two-pointer technique.
# A `fast` pointer is moved `n` steps ahead, and then both `fast` and `slow` pointers are moved together until `fast` reaches the end.
# At that point, `slow` is just before the node to be removed, and we adjust pointers to exclude it from the list.

# Time Complexity: O(n), where n is the number of nodes in the linked list, since each node is visited at most once.
# Space Complexity: O(1), as the algorithm uses a constant amount of space.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        slow = fast = head

        for _ in range(n):
            fast = fast.next
        
        if not fast:
            return slow.next
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next

        return head
