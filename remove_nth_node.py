# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

#time comlexity: O(n)
#space complexity: O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head==None: return head
        dummy=ListNode(0,head)
        fast=dummy
        slow=dummy
        count=0
        while(count<=n):
            fast=fast.next
            count+=1
        while(fast!=None):
            fast=fast.next
            slow=slow.next
            
        slow.next=slow.next.next
        
        return dummy.next