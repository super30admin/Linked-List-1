// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if (head==None or head.next==None):
            return head
        prev=None
        cur=head
        fast=head.next
        while(fast!=None):
            cur.next=prev
            prev=cur
            cur=fast
            fast=fast.next
        cur.next=prev
        return cur
        
