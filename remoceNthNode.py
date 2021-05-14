# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy
        while n!=0:
            fast = fast.next
            n-=1
        while fast.next is not None:
            fast = fast.next
            slow = slow.next
        slow.next=slow.next.next
        return dummy.next
    
#  code is basically using a fast and slow pointer. Fast pointer is the one which initially creates a gap of n elements. 
#  Once gap is created both go at 1x speed till fast.next is not null. Once it hits that place, just make slow.next to be slow.next.next

#  time complexity is O(n) and space complexity is O(1)
        
