# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # #Recursive process
        # def recur(node):
        #     if (node==None or node.next==None):
        #         return node
        #     head=recur(node.next)
        #     node.next.next=node
        #     node.next=None
        #     return head
        # return recur(head)  
        # #time O(n)
        # #Space O(n)
        
        #Iterative process
        if head==None or head.next==None:
            return head
        cur=head
        fast=head.next
        prev=None
        while(fast!=None):
            cur.next=prev
            prev=cur
            cur=fast
            fast=fast.next
        cur.next=prev
        return cur
        #Time O(n)
        #Space O(1)
        
            
            
                
           
