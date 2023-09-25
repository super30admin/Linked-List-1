# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head):
        slow = head
        fast = head
        res = False
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                res = True
                break

        if res == False:
            return None

        fast = head
        while fast != slow:
            fast = fast.next
            slow = slow.next
        return slow

#TC: O(n)
#SC: O(1)