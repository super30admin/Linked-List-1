#Time Complexity :O(n)
#Space Complexity :O(1) 
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy=ListNode(-1,head)
        slow=dummy
        fast=dummy
        count=0
        while count<=n:
            fast=fast.next
            count+=1
        
        while fast!=None:
            slow=slow.next
            fast=fast.next

        #temp=slow.next
        slow.next=slow.next.next
        #temp.next=None

        return dummy.next
        