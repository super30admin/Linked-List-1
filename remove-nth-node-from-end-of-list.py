# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head==None: return head
        dummy=ListNode(0,head)
        count=n
        slow=dummy
        fast=dummy
        while count>=0:
            fast=fast.next
            count-=1
        while fast!=None:
            slow=slow.next
            fast=fast.next
        slow.next=slow.next.next
        return dummy.next
            
        