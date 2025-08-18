# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
#Time Complexity : o(n)
#Space Complexity : o(1)
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        current = head
        fast = head
        hasCycle = False

        while fast != None and fast.next != None:
            current = current.next
            fast = fast.next.next
            if fast == current:
                hasCycle = True
                break

        if not hasCycle:
            return None

        slow = head

        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow




