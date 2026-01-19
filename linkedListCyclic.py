# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None
        fast, slow = head, head
        flag = False
        while ( fast.next != None and fast.next.next!= None):
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
        if flag is False:
            return
        fast = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow

        