# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
#
# // Your code here along with comments explaining your approach

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(-1)
        slow = dummy                # Using Dummy Node to handle edge cases
        fast = dummy
        dummy.next = head
        count = 0

        while count <= n and fast != None:
            fast = fast.next
            count += 1

        while fast != None:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next
        return dummy.next