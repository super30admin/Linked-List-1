# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        # Time Complexity - O(N)
        # Space Complexity - O(1)
        
        #base case
        if head == None:
            return head
        # 1-->2-->3-->4-->5
        p1=head # Pointer 1 Initially at 1
        p2=head.next # Pointer 2 # Initially at 2
        head.next=None # To know that after reversing the linked list ending point since it ends at null
        while p2 != None: #(Stopping condition - when p2 becomes None)
            temp=p2.next # 1-->2-->3-->4-->5 When 2 is connected to 1 i.e. 1<--2 we will loose linkedlist from 3
                         # So to keep a temporary pointer to 3 which we can make p2 later after swaping
            p2.next=p1 # 1<--2
            p1=p2  # Updating p1 with 2 since for next iteration 2<--3 has to be done
            p2=temp # Updating p2 with temp
            
        return p1
        