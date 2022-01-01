# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    
    globalHead = None    
    def reverseLList(self,head):      
        #base case
        if head.next==None:
            self.globalHead = head
            return
        
        #logic 
        self.reverseLList(head.next)
        head.next.next = head
        head.next=None
            
    def reverseList(self, head: ListNode) -> ListNode:
        if head == None:
            return None
        
        self.reverseLList(head)
        return self.globalHead
        
        