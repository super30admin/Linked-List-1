# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0
        # print(dummy)
        while count <= n:
            fast = fast.next
            count += 1
        # print(count,fast)
        while fast != None:
            fast = fast.next
            # print(fast, 'Fast')
            slow = slow.next
        # print(slow, 'Slow')

        slow.next = slow.next.next
        # print(slow)
        return dummy.next

# TC = O(n) we traverse all the elements of linkedlist once. Single pass
# Space complexity : O(1). Constant. No extra space used
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No
