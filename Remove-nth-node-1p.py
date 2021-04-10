# It is a single pass approach
# uses the concepts of 2 pointers and dummy node
# Time complexity is O(n), Space Complexity is O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(-1,head)
        slow, fast = dummy , dummy
        count = 0
        while count <= n:
            fast = fast.next
            count += 1
        while fast:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next
        return dummy.next

        
