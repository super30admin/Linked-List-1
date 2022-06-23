# 142. Linked List Cycle II
"""
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
trying to send fast and slow in loop.
One they are entered in a loop, both of them will meet at some point in a loop if speed of one is 2x time other.
slow = 1x anf fast = 2x.
Once they meet in a loop, reset slow to head and then move both by 1x. Where they will meet will
be location of cycle begining
"""


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # null
        if head == None:
            return None

        # logic
        flag = False
        slow = ListNode()
        fast = ListNode()
        slow = head
        fast = head

        # making them enter into a cycle.
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True  # checking if there was a cycle or not
                break

        # if there was no cycle, then fast will reach None.
        if flag == False:
            return None

        slow = head

        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow