# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow,fast=head,head
        cycle=False
        while fast!=None and fast.next!=None:
            slow=slow.next
            fast=fast.next.next
            if slow==fast:
                cycle=True
                break
        slow=head
        if cycle:
            while True:
                if slow==fast:
                    return slow
                slow=slow.next
                fast=fast.next
        else:
            return None