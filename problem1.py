#Time complexity O(n), space complexity O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if head is None:
            return None
        
        return self.helper(head)


    def helper(self,head):
        #slow and fast pointer for reversing the list
        s=None
        c=head
        f=head.next
        
        while c:
            c.next = s
            s=c
            c=f
            
            if f:
                f=f.next
                
        return s
       
