# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# TC : O(n) iterative
# SC : O(1)

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        '''
        #iterative
        prev, curr = None, head
        
        while(curr!= None):
            new_node = curr.next
            curr.next = prev
            prev = curr
            curr = new_node
        return prev
        '''
        
         #recursive
        # base case
        if(head == None or head.next==None):
            return head
        
        newHead = self.reverseList(head.next)
        head.next.next = head
        head.next = None
            
        return newHead
