
"""
206. Reverse Linked List
Easy
"""
from leetcode_runner import LeetCode, TestCase, Args
from typing import *

PROBLEM = """
Given the head of a singly linked list, reverse the list, and return the reversed list.
 
Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:


Input: head = [1,2]
Output: [2,1]

Example 3:

Input: head = []
Output: []

 
Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000

 
Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?

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
    Space Complexity: O(n) | O(n) for the call stack
    Explanation: Reverse the linked list recursively. We are doing the same thing as the iterative solution, but with recursion.
        
    """
    def reverseList(self, head: ListNode) -> ListNode:
        prev = None
        walker = head
        def flip(prev: ListNode, walker: ListNode) -> ListNode:
            if walker is None:
                return prev # 
            temp = walker.next
            walker.next = prev
            prev = walker
            walker = temp
            return flip(prev, walker)
        return flip(prev, walker)
    
    """
    NOT ACCEPTED

    # Why does this not work?
    It looks like you're trying to reverse a linked list using a recursive approach. 
    However, there's an issue with your code. The problem is with the usage of the prev variable. 
    In Python, when you pass a variable to a function, it is passed by value. 
    So, changing the value of prev inside the flip function won't affect the value of prev outside the function.

    To fix this issue, 
    you can use a helper function that takes prev as a parameter and returns the reversed linked list. 
    Here's an updated version of your code:
     -- REFER reverseList() Method
    
     ---------------- OR ----------------
     You can declare walker as a global variable if you want to maintain it across recursive calls. Here's an example:
     This might be confusing though, so I would recommend using the first approach.
        
        def flip(walker: ListNode) -> None:
        global global_prev
        if walker is None:
            return
        temp = walker.next
        walker.next = global_prev
        global_prev = walker
        flip(temp)
    
    """
    def reverseList4(self, head: ListNode) -> ListNode:
        prev = None
        walker = head
        def flip(prev: ListNode, walker: ListNode) -> None:
            if walker is None:
                return
            temp = walker.next
            walker.next = prev
            prev = walker
            walker = temp
            flip(prev, walker)
        flip(prev, walker)
        return prev
    """
    Accepted
    Time Complexity: O(n)
    Space Complexity: O(1)
    
    Explanation: Reverse the linked list in place
        Maintain a pointer to the previous node, and a pointer to the current node, 
        reverse the link to current node's next to the previous node and store the next node in a temp variable.
        Keep doing this until the current node is None and return the previous node as the new head.
    """
    def reverseList3(self, head: ListNode) -> ListNode:
        prev = None
        walker = head
        while walker is not None:
            temp = walker.next
            walker.next = prev
            prev = walker
            walker = temp
        return prev

    """
    Accepted
    Time Complexity: O(n)
    Space Complexity: O(n)
    
    Explanation: Store all the values in a list, then create a new linked list from the list
    """
    def reverseList2(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        lis = []
        walker = head
        while walker is not None:
            lis.append(walker.val)
            walker = walker.next
        newHead = ListNode(lis[-1])
        walker = newHead
        for i in range(len(lis)-2,-1,-1):
            newNode = ListNode(lis[i])
            walker.next = newNode
            walker = walker.next
        return newHead

LeetCode(PROBLEM, Solution).check()
