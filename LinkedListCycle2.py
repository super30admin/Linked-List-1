# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Firstly, we can detect if it's a cycle or not by using slow and fast pointer
# Then logic of 2(a+b) = 2(a+b+c), if we simplify we get a = c. We can move the slow or fast pointer
# to head and then move them slowly until they meet to detect where the cycle started

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        while (fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next
            if (slow == fast):
                break
        else:
            return None

        slow = head

        while (slow != fast):
            slow = slow.next
            fast = fast.next

        return slow

