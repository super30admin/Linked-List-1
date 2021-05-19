# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        '''
        TC : O(N) one pass to find the Nth node
        SC : O(1) no extra space used
        Approach : take two pointers and start first pointer ahead of the second by N. 
        when 1st pointer reach the nth position start second pointer from strat and return the node when the first pointer reaches the end.
        
        '''
        ptr = head
        while n:
            ptr = ptr.next
            n-=1
        if not ptr:
            return head.next
        ptr1 = head
        while ptr.next:
            ptr = ptr.next
            ptr1 = ptr1.next
        ptr1.next =ptr1.next.next
        return head
        