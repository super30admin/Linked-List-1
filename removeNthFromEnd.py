# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
#Time Complexity:O(n)
#space Complexity: O(1)
#I am creating a dummy node pointing to head. Using two pointers slow and fast,. Fast pointer is moved untill we reach thw nth node, then we move the slow pointer and set slow.next top slow.next.next . This removes the link between them. 

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if not head or not head.next:
            return None
        # assert n > 0
        dummy = ListNode(-1)
        dummy.next = head
        slow, fast = dummy, dummy
        for i in range(n):
            fast = fast.next
            # assert fast
        while fast.next:
            fast = fast.next
            slow = slow.next
        slow.next = slow.next.next
        return dummy.next
        
