# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# Time complexity - o(n)
# Space complexity - o(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        dummy = ListNode(-1)
        dummy.next = head

        slow = dummy
        fast = dummy

        cnt = 0

        while cnt<=n:
            fast = fast.next
            cnt+=1

        while fast:
            slow = slow.next
            fast = fast.next

        temp = slow.next
        slow.next = slow.next.next
        temp.next = None

        return dummy.next
    