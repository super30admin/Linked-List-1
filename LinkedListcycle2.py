# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # TC : O(n)
        # SC : O(1)
        if head is None:
            return None
        hasCycle = False
        slow,fast = head,head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                hasCycle = True
                break
        
        if hasCycle == True:
            fast = head
            while fast and fast.next:
                if slow == fast:
                    return slow
                slow = slow.next
                fast = fast.next
        return None
