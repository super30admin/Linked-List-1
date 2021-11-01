# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        # check if cycle is present        
        start = head
        slow = start
        fast = start
        # Traverse till slow meets fast
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            # when slow meets fast, initiate a pointer from head
            # move both by 1 till they meet, this is start of cycle
            if slow == fast:
                pos2 = slow
                pos1 = start
                # move both by 1 till they meet
                while pos1 != pos2:
                    pos1 = pos1.next
                    pos2 = pos2.next
                return pos1
        return None        