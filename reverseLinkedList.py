#Time Complexity: O(N)
#Space Complexity: O(N)
#Did It run in Leetcode: Yes



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #This condition checks if the element present is single element or the linked list is empty
        if(head==None or head.next==None):
            return head

        #Variable assignment
        prev=None
        curr=head
        fast=head.next

        #This while loop and the following condition takes care of reversing the linked list and traverses through the Linked List
        while(fast!=None):
            curr.next=prev
            prev=curr
            curr=fast
            fast=fast.next
        #Assigning last element the previous value
        curr.next=prev
        return curr


#Following code is recursive solution of the above mentioned problem


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if (head == None or head.next == None):
            return head
        rlist = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return rlist