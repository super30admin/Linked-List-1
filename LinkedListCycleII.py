# TC = O(n)
# SC = O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        fast = head
        slow = head
        flag = False
        while fast != None and fast.next != None:
            fast = fast.next.next
            slow = slow.next
            if slow == fast:
                flag = True
                break

        if flag == True:
            fast = head
            while fast != slow:
                fast = fast.next
                slow = slow.next

        return slow if flag is True else None
