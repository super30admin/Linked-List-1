# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
#Time Complexity : o(2n)
#Space Complexity : o(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        count = 0
        curr = head
        while curr != None:
            count += 1
            curr = curr.next

        # Step 2: Edge case — remove head
        if n == count:
            return head.next

        sum = 0
        curr = head

        while sum < count - n - 1:
            curr = curr.next
            sum += 1

        curr.next = curr.next.next

        return head