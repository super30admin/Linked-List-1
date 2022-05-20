# Definition for singly-linked list.
#Time complexity: O(n)
#Space complexity: O(1)
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head):
        flag=False
        slow,fast=head,head
        while fast and fast.next:
            slow=slow.next
            fast=fast.next.next
            if slow==fast:
                flag=True
                break
        if flag==True:
            slow=head
            while(slow!=fast):
                slow=slow.next
                fast=fast.next
            return slow
        return None