# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
"""
Taking a fast and slow pointer and creating appropriate gap between them
by moving fast ptr by 1 first until it is less than or eq to n.
After gap creation, move BOTH fast and slow pointer by one until fast reaches null 
when fast is at null, slow will be exactly at node to be removed

Use of dummy node: To handle edge case of LL of len(1) where node to be removed is head.
"""
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy=ListNode(-1) #not using thus -1
        dummy.next=head
        slow=dummy
        fast=dummy
        count=0
        #gap creation
        while (count<=n and fast!=None):
            fast=fast.next
            count+=1
        #move both after gap creation
        while fast!=None:
            slow=slow.next
            fast=fast.next

        #slow will be at right position
        slow.next=slow.next.next
        return dummy.next
