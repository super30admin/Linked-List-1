#Time Complexity: O(2n)
#Space Complexity: O(1)

# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        count=0
        curr=head
        if head==None:
            return head
        
        while curr!=None:
            count+=1
            curr=curr.next
        if count==n:
            return head.next
        nodetoremove=count-n
        curr=head
        for i in range(nodetoremove-1):
            curr=curr.next
        curr.next=curr.next.next
        return head
           
#Optimized One Pass Approach
#Time Complexity: O(n)
#Space Complexity: O(1)

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        fast=head
        slow=head
        for i in range(n):
            fast=fast.next
        if fast==None:
            return head.next
        while fast.next!=None:
            slow=slow.next
            fast=fast.next
        slow.next=slow.next.next
        return head
            
        