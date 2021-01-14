'''
Time: O(n)
Space: O(1)
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        def reverseIt(head):
            it = None
            while head!=None:
                temp = head.next
                if(it==None):
                    it = head
                    it.next = None
                else:
                    head.next = it
                    it = head    
                head = temp
                
            return it
        
        def reverseRec(head, i):
            if(head==None or head.next==None):
                return (head,head)
            ll,f = reverseRec(head.next, i+1)
            ll.next = head
            if(i==0):
                head.next=None
            return (ll.next,f)
        
        return reverseRec(head,0)[1]
        #return reverseIt(head)
