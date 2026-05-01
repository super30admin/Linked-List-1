# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# Time Complexity --> O(n)
# Space Complexity --> O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(None)
        dummy.next = head
        slow, fast = dummy, dummy

        count = 0
        while count<=n:
            count += 1
            fast = fast.next
        
        while fast is not None:
            fast = fast.next
            slow = slow.next
        temp = slow.next
        slow.next = slow.next.next
        temp.next = None

        return dummy.next
