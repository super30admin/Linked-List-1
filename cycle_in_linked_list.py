# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# TC: O(n)
# SC: O(1)
class Solution:

    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None :
            return None

        hasCycle = False
        slow = head
        fast = head

        while fast is not None and fast.next is not None:
            fast = fast.next.next
            slow = slow.next

            if slow == fast:
                hasCycle = True
                break

        if not hasCycle:
            return None
        
        fast = head
        while fast!=slow:
            fast = fast.next
            slow = slow.next

        return slow

