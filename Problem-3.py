"""
## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

Note: Do not modify the linked list.

Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.


Example 2:

Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.


Example 3:

Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.


Follow up:
Can you solve it without using extra space?

TIME- 0(N)
SPACE - CONSTANT
LEETCODE - YES
"""


# Definition for singly-linked list.
#
class ListNode:
     def __init__(self, x):
         self.val = x
         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:

        slow = head  # slow pointer will hop once
        fast = head  # fast pointer will hop twice

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:  # cycle detected

                Dummyhead = head  # create dummy head

                while Dummyhead != slow:  # when dummy head and slow pointer meet, that is the position tail connects
                    Dummyhead = Dummyhead.next
                    slow = slow.next
                return slow
        return None


