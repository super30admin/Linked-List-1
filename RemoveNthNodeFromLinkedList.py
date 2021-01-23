# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        # Time Complexity - O(N)
        # Space Complexity - O(1)
        
        # base case
        if head == None:
            return head
        dummy=ListNode() # Dummy Node to handle the case where we have to delete the first value
        dummy.next=head
        p1=dummy # Pointer 1
        p2=dummy # Pointer 2
        for i in range(0,n+1): # Moving p2 to n+1 distance so as to maintain distance of n in between p1 and p2
            p2=p2.next
            
        while(p2!=None): # As the distance between p1 and p2 is n, when p2 becomes null, the next value has to be deleted
            p1=p1.next
            p2=p2.next
            
        p1.next=p1.next.next # Deleting the next of p1 to p1.next.next
        
        return dummy.next # Dummy.next points to the head, so starting from head will be returned
        