# TC : O(2n) = O(n)
# SC : O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        find_size = 0
        dummy = head
        while dummy:
            find_size += 1
            dummy = dummy.next
        # print(find_size)
        i = 1
        dummy2 = head
        if find_size-n==0:
            head = head.next
            return head
        while i != find_size-n:
            # print(dummy2.val)
            dummy2 = dummy2.next
            i += 1
        dummy2.next = dummy2.next.next
        return head