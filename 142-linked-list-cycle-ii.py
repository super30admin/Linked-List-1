
"""
142. Linked List Cycle II
Medium
"""
from leetcode_runner import LeetCode, TestCase, Args
from typing import *

PROBLEM = """
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
Do not modify the linked list.
 
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

 
Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.

 
Follow up: Can you solve it using O(1) (i.e. constant) memory?

"""

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    """
    Accepted
    Time Complexity: O(n)
    Space Complexity: O(1)
    
    Explanation: 
    Floyd's Cycle-Finding algorithm 
    Use two pointers, walker and runner. Walker moves one step at a time, and runner moves two steps at a time.
    If a cycle is present, then walker and runner will meet at some point.
    Now, reset walker to head, and move both walker and runner one step at a time. They will meet at the start of the cycle.
    Its
    Refer: https://leetcode.com/problems/linked-list-cycle-ii/solutions/3274329/clean-codes-full-explanation-floyd-s-cycle-finding-algorithm-c-java-python3/
    
    """
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        walker = head
        runner = head
        flag = False
        while runner is not None and runner.next is not None: # cycle check loop
            walker = walker.next
            runner = runner.next.next
            if walker == runner:  #cycle is there
                flag = True
                break
        if flag is False:
            return None
        else: # find the start of the cycle
            walker = head # slow pointer reset to head
            # now according to the algorithm, moving both pointers one step at a time will meet at the start of the cycle
            while walker != runner:
                walker = walker.next
                runner = runner.next
            return walker
        
    """
    Accepted
    Time Complexity: O(n)
    Space Complexity: O(n)
    
    Explanation: Use a set to store the visited nodes. If a node is already in the set, 
    then it is the start of the cycle.
    """
    def detectCycle2(self, head: Optional[ListNode]) -> Optional[ListNode]:
        res = set()
        dummy = ListNode(0)
        dummy.next = head
        # walker = dummy.next
        while dummy.next is not None:
            if dummy.next in res:
                return dummy.next
            else:
                res.add(dummy.next)
                dummy = dummy.next

LeetCode(PROBLEM, Solution).check()
