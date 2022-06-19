# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head==None or head.next==None: return None
        slow=head
        fast=head
        flag=False
        while fast!=None and fast.next!=None:
            slow=slow.next
            fast=fast.next.next
            if slow==fast:
                flag=True
                break
        if not flag:
            return None
        slow=head
        while slow!=fast:
            slow=slow.next
            fast=fast.next
        return slow
        
        