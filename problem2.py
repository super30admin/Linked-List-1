#Time complexity O(n), space complexity O(n)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        #creating dummy node for returning the head
        dummy = ListNode(1)
        dummy.next = head
        #Fast and slow pointer
        s=f=head
        c=0
#Movving fast pointer to find the nth node
        while c<n:
            f=f.next
            c+=1
#traversing slow and fast            
        while f.next:
            s=s.next
            f=f.next
            
        s.next=s.next.next
        
        print(dummy.next)
        return dummy.next
