# Space Complexity: O(n)
# Time Complexity: O(1) 

class ListNode(object):
    def _init_(self,x):
        self.val=x
        self.next=None
class Solution:
    def detectCycle(self, head) :
        fast, slow= head, head
        while fast and fast.next:
            fast=fast.next.next
            slow=slow.next
            if fast==slow:
                fast=head
                while fast!=slow:
                    fast=fast.next
                    slow=slow.next
                return slow
        return None