
# TC:O(n)
# SC:o(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        dummy = ListNode(-1)
        dummy.next = head

        count = 0
        # count elements
        curr = head
        while curr is not None:
            count += 1
            curr = curr.next

        count = count - n
        curr = dummy
        print(count)
        i = 0
        while curr is not None and i < count:
            curr = curr.next
            i += 1

        curr.next = curr.next.next

        return dummy.next