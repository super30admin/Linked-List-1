# Definition for singly-linked list.
#Time complexity: O(n)
#Space complexity: O(1)
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head, n: int):
        dummy=ListNode(-1,head)
        slow,fast=dummy,dummy
        count=0
        while fast:
            while count<=n:
                count+=1
                fast=fast.next
            if fast:
                slow=slow.next
                fast=fast.next
        slow.next=slow.next.next
        return dummy.next 
               
        