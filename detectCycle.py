"""
Time Complexity O(N)
Space Complexity O(1)

"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow=fast=head
        flag=False
        while fast and fast.next :
            slow=slow.next 
            fast=fast.next.next
            if fast ==slow:
                flag=True
                break
        if not flag:
            return None
        slow=head
        while slow!=fast :
            slow=slow.next 
            fast =fast.next 
        
        return slow 
        