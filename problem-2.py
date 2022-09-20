#tc: O(n)
#sc: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head is None: return None
        temp = ListNode(0,head)
        slow = temp
        fast = temp
        i = 0
        while i<=n:
            i += 1
            fast = fast.next
        while fast:
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next

        return temp.next