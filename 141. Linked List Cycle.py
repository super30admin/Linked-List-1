"""
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

Follow up:

Can you solve it using O(1) (i.e. constant) memory?

 

Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:


Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:


Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: ListNode) -> bool:
        """
        Lets assume
        The straight path is X node
        The circular path is A + B node
        if slow meets fast after A nodes
        Then slow travelled X+A nodes
        Fast Travelled X+A+B+A nodes
        2 * slow = fast i.e we get X = B
        So we need to move one pointer to start and move slow and fast by one step.
        If slow meets fast we have in the enterance of the cycle 
        """
        # Run time complexity: O(N)
        # Space Complexity: O(1)
        fast = head
        slow = head
        if head == None or head.next == None:
            return False
        while(fast != None and fast.next != None):
            slow = slow.next
            fast= fast.next.next
            if(slow == fast):
                slow = head
                while (slow != fast):
                    slow = slow.next
                    fast = fast.next
                return True
        return False