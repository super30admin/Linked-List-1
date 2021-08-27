# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    """
    Iterative approach: 2x the speed to find cycle then 1x       the speed to find the index
    TC - O(n)
    SC - O(1)
    """
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head:
            return None
        slow, fast = head,head
        ans = False
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                ans = True
                break
        if not ans:
            return None
        else:
            slow = head
            while slow != fast:
                slow = slow.next
                fast = fast.next
            return slow