#Time Complexity: O(N)
#Space Complexity: O(1)


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head ==None:
            return None
        slow=head
        fast=head
        hasCycle=False
        while fast !=None and fast.next !=None:
            slow=slow.next
            fast=fast.next.next
            if slow==fast:
                hasCycle=True
                break
        if hasCycle==False:
            return None
        fast=head
        while fast !=slow:
            slow=slow.next
            fast=fast.next
        return slow

        