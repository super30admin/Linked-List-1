# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = fast = head
        isCycle = False
        while fast!= None and fast.next!= None:
            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                isCycle = True
                break
        if isCycle:
            s2 = head
            while s2 != slow:
                s2 = s2.next
                slow = slow.next
            return s2
        else:
            return None
        