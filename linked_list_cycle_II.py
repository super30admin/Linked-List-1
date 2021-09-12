# Did this code successfully run on Leetcode : YES

# TC: O(N)
# SC: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        flag = False
        slow = head
        fast = head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                flag = True
                break
        if not flag:
            return None
        p1 = head
        p2 = slow
        while p1 != p2:
            p1 = p1.next
            p2 = p2.next
        return p1