#Time: O(n)
#Space: O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:  
            return None
        curr= head
        slow= curr
        fast= curr
        ctr=0
        while(fast.next is not None and fast.next.next is not None):
            slow= slow.next
            fast= fast.next.next
            ctr +=1
            if slow == fast:
                break
        if(slow != fast) or ctr == 0:
            return
        fast= head
        while(slow != fast):
            slow= slow.next
            fast= fast.next
        return slow
