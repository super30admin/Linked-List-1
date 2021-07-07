// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

// TWO PASS ALGORITHM
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if(head==None or head.next==None):
            return 
        count=0
        i=0
        node=head
        while(node!=None):
            count+=1
            node=node.next
        curr=head
        if(count-n==0):
            head=head.next
        while(curr!=None):
            i+=1
            if(i==count-n):
                curr.next=curr.next.next
            curr=curr.next
        return head 
        
 /// ONE PASS ALGORITHM
 # Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy=ListNode(0)
        dummy.next=head
        if(head==None or head.next==None):
            return
        slow=dummy
        fast=dummy
        count=0
        while(count<=n):
            fast=fast.next
            count+=1
        while(fast!=None):
            fast=fast.next
            slow=slow.next
        slow.next=slow.next.next
        return dummy.next
