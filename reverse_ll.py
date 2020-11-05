# Time Complexity:- O(n)
# Space Complexituy:- O(1)
# Approach:- Recurse till the end of the linkedlist keeping a track of the head and next node, aftr the base condition is reached,
# make the prev pointer at this point the head and point the prev to head and continue this way. And then return the head
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        def rev(prev,head):
            if head==None:
                # base condition reached the prev at this point is the new head now
                self.head=prev
                return
            rev(head,head.next)
            # we are reversing the LinkedList point the head->next to prev and move on
            head.next=prev
        # At first prev=None
        rev(None,head)
        # return the new head
        return self.head
        
        