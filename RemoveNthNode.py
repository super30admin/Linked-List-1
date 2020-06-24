# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy_node=ListNode(None)
        dummy_node.next=head
        head=dummy_node
        fast=head
        slow=head
        count=0
        while(fast!=None):
            if count<=n:
                fast=fast.next
                count+=1
            else:
                fast=fast.next
                slow=slow.next
        slow.next=slow.next.next
        return dummy_node.next
Time is O(n)
Space is O(1)
