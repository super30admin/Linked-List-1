# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
#
# // Your code here along with comments explaining your approach
# Using 2 pointers : Slow and Fast. When Slow and fast pointers meet, there's a cycle formed.


# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = head
        fast = head
        flag = False
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
        if not flag: return None
        fast = head
        while slow != fast:
            slow = slow.next
            fast = fast.next

        return fast
