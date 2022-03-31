# Time complexity :- O(n)
# Space complexity :- O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slowpointer = head
        fastpointer = head

        while (fastpointer != None and fastpointer.next != None):
            fastpointer = fastpointer.next.next
            slowpointer = slowpointer.next

            if slowpointer == fastpointer:
                break

        if fastpointer == None or fastpointer.next == None:
            return None

        slowpointer = head

        while (slowpointer != fastpointer):
            fastpointer = fastpointer.next
            slowpointer = slowpointer.next
        return slowpointer


