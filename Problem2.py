# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

#Time Complexity - O(n) n-length of the list
#Space Complexity - O(1)

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        Fast=head
        Slow=head
        
        for i in range(n):
            Fast=Fast.next
        
        if Fast is None:
            return head.next
        
        while Fast.next:
            Fast=Fast.next
            Slow=Slow.next
        Slow.next=Slow.next.next
        
        return head