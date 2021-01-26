#Time Complexity:O(n)
#Space Complexity:O(1)

#Iterative Solution

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head or not head.next:               #if the LinkedList is Empty of has only one node return same list
            return head
        prev=None                                   #assign 3 points prev to null,curr to head and fast to 2nd node
        curr=head
        fast=head.next
        while(fast):                                #as long as fast is not null
            curr.next=prev                          #point the current node to the previous node
            prev=curr                               #move all three pointers by one
            curr=fast
            fast=fast.next
        curr.next=prev                              #assign last node pointer to last but one node
        return curr                                 #return the reversed list

#Recursive Solution
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        rev=self.reverseList(head.next)
        head.next.next=head
        head.next=None
        return rev