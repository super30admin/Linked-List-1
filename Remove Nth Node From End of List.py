# Take two pointers fast and slow. Fast pointer will traverse n times in first for loop. In the second for loop, bith fast and slow pointer will increment by 1.  At this time, there is gap of n nodes in both pointers. When fast pointer approaches the end, slow pointer is on nth node. Delete it by linking node.next = node.next.next. Point dummy at head. Return head
# Edge case - where you want to remove first node. Suppose list of 2 nodes and remove 2nd node from last i.e. first node. In this case, after first for loop, fast is null. Hence we jsut return 2nd node as head by omitting 1st node instead of deleting.
# TC - O(N), SC - O(1)


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head:
            return None

        slow = fast = head
        for i in range(0,n):
            fast = fast.next
        if not fast:
            return head.next
        while fast.next:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return head

       
        