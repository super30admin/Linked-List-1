#Time Complexity: O(n)
#Space Complexity: O(1)
#Did it run on leetcode:


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head:
            return
        
        if head.next is None and n == 1:
            return None
        if head.next.next is None and n == 2:
            return head.next
        jumps = n - 1
        index = 0
        curr1 = head
        while index < jumps:
            curr1 = curr1.next
            index += 1
        prev = None
        curr2 = head
        while curr1.next:
            prev = curr2
            curr2 = curr2.next
            curr1 = curr1.next
        if prev is None:
            return head.next
        prev.next = curr2.next
        return head