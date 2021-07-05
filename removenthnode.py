# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
# Optimal : One pass solution
# time complexity = O(n)
# space complexity = O(1)

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if not head:
            return None
        dummy = ListNode(0)
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0
        while(count <= n):
            fast = fast.next
            count += 1
        while(fast != None):
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next