# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Time Complexity : O(N)
# Space Complexity : O(1)
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]: # type: ignore
        if head == None:
            return head
        hascycle = False
        slow_pointer = head
        fast_pointer = head
        while fast_pointer != None and fast_pointer.next != None:
            slow_pointer = slow_pointer.next
            fast_pointer = fast_pointer.next.next

            if slow_pointer == fast_pointer:
                 hascycle = True
                 break

        if hascycle == False:
            return None
        fast_pointer = head
        while slow_pointer != fast_pointer:
            fast_pointer = fast_pointer.next
            slow_pointer = slow_pointer.next
        return slow_pointer
