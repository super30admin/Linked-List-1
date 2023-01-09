#time complexity: O(n)
#space complexity: O(1)
#ran on leetcode: Yes
#have 2 pointers, first and second. Move first pointer n times. Now initialise seconde pointer to head and move both first and second pointer unitl first pointer reaches the end of the linked list. Now second pointer will point to the element that ahs to be deleted.
# previous will be the head of reversed linked list.
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        first=head
        second=head
        while(n>0):
            first=first.next
            n-=1
        
        while(first and first.next):
            first=first.next
            second=second.next
        if(first==None):
            head=head.next
        else:
            second.next=second.next.next
        return head

        
