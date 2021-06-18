#Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow_ptr=head
        fast_ptr=head
        flag=False
        #fast.next=null will happen for odd number of nodes ,
        #fast=null will happen for even number of nodes, so checking both ptr for null
        while fast_ptr!=None and fast_ptr.next!=None:
            slow_ptr=slow_ptr.next
            fast_ptr=fast_ptr.next.next
            if (slow_ptr==fast_ptr):
                flag=True
                break

        if (not flag):
            return None
        fast_ptr=head  #reset, may reset slow/fast
        while slow_ptr!=fast_ptr:
            slow_ptr=slow_ptr.next
            fast_ptr=fast_ptr.next
        return fast_ptr
