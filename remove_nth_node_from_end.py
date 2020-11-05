# Time Complexity:- O(n) - No. of nodes in the linked List
# Space Complexity:- O(1)
# Approach:- Maintain two pointers prev and next. Go to the end of the list and start going back increasing your counter,
# when the counter equals n-1 we have encountered next pointer save it, when the counter equals n+1 we have prev pointer,
# At the end of the traversal point prev.next to next pinter and return head.
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        self.prev,self.next=None,None
        self.ctr=0
        def removenth(head):
            if head is None:
                return
            removenth(head.next)
            self.ctr+=1
            # we have next pointer here
            if self.ctr==n-1:
                self.next=head
            # we have prev pointer here
            if self.ctr==n+1:
                self.prev=head
        removenth(head)
        # if prev is None point to next and return 
        if self.prev==None:
            return self.next
        # if next is None we have to join prev to next so we make prev->next=None
        if self.next==None:
            self.prev.next=None
        # if both the cases are not true we have valid prev and next pointer point prev->next to next and return head
        self.prev.next=self.next
        return head