
"""
19. Remove Nth Node From End of List
Medium
"""
from leetcode_runner import LeetCode, TestCase, Args
from typing import *

PROBLEM = """
Given the head of a linked list, remove the nth node from the end of the list and return its head.
 
Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:

Input: head = [1], n = 1
Output: []

Example 3:

Input: head = [1,2], n = 1
Output: [1]

 
Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz

 
Follow up: Could you do this in one pass?

"""

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    """
    Accepted
    Time Complexity: O(n)
    Space Complexity: O(1)
    One pass Algorithm
    
    Explanation: The intuition is to have a window of size n right in the beginning of the list using two pointers.
        #NOTE -> We use the dummy node to help us with the edge cases, as it will be the node before the head. Easy to remove the element
        and it also handles the edge case of the list having only one element.
        Now increase the window of pointers by 1 untill the runner hits the end
        Walker will be at the node before the node to be deleted delete and return dummy.next  
        
        EX: D -> 1 -> 2 -> 3 -> 4 -> 5 -> None with size 2
        Window Starts with || runner = 2, walker = D
        Ends with || runner = 5, walker = 3
        This is the advantage of having the Dummy, as walker ends in 3 [n + 1 elemnt], and we basically remove the next element 
    """
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        runner = dummy
        count = 1
        while count <= n: # make the window of size n
            runner = runner.next
            count += 1
        walker = dummy
        while runner.next is not None: # move the window till the end
            walker = walker.next
            runner = runner.next
        walker.next = walker.next.next # remove nth element
        return dummy.next

LeetCode(PROBLEM, Solution).check()
