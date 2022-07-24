'''
## Problem 206: Reverse linked list

## Author: Neha Doiphode
## Date:   07-16-2022

## Description:
    Given the head of a singly linked list, reverse the list, and return the reversed list.

## Examples:
    Example 1:
        Input: head = [1,2,3,4,5]
        Output: [5,4,3,2,1]

    Example 2:
        Input: head = [1,2]
        Output: [2,1]

    Example 3:
        Input: head = []
        Output: []

## Constraints:
    The number of nodes in the list is the range [0, 5000].
    -5000 <= Node.val <= 5000

## Follow up:
    A linked list can be reversed either iteratively or recursively. Could you implement both?

## Time complexity: Please refer to doc-strings of respective approaches used.

## Space complexity: Please refer to doc-strings of respective approaches used.

'''

from typing import List, Optional
from copy import deepcopy

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def get_input():
    print("Enter the list of integers or nodes to be added to the linked list(with spaces): ", end = "")
    inp = input()
    inp = [int(val) for val in inp.split()]

    head = None
    last = None
    for val in inp:
        if head == None:
            head = ListNode(val)
            last = head
        else:
            last.next = ListNode(val)
            last = last.next
    print()
    return head, inp

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        '''
        Time complexity: O(n), where n is number of nodes present in the list.
                               Since, we are traversing list once to revert the pointers.
        Space complexity: O(1), No auxiliary space is used to reverse the list.
        '''
        previous = None
        current = head
        while current:
            next = current.next
            current.next = previous
            previous = current
            current = next
        return previous

    def reverseList_recursive(self, head: Optional[ListNode]) -> Optional[ListNode]:
        '''
        Time complexity: O(n), where n is number of nodes present in the list.
                               O(n) to traverse the list once to go thru each recursion cycle.
                               O(n) to revert each node and unstack the recursion.
                               O(2n) ~= O(n).
        Space complexity: O(n) Auxiliary space is required to store nodes on the recursion stack.
        '''
        # base case
        if head == None or head.next == None:
            return head

        # logic
        reversed_head = self.reverseList(head.next)

        # when last node is return, we pop last node from the stack.
        # And the program returns to the point where it was abandoned.
        # program in this case always abandoned on the previous head before processing head.next
        # when any node is popped out, we are at previous node/head.
        # to revert the link, we need to store 4->5 head = 4, head.next = 5,
        # head.next.next = head will store 4 in 5.next resulting into a reverted link between 4 & 5.
        head.next.next = head

        # for each iteration we need to terminate the reversing. So once 1->2 is reverted to 2->1
        # we need to store None in 1.next
        head.next = None
        return reversed_head

    def display(self, head: ListNode) -> None:
        l = []
        if head != None:
            temp = head
            while temp:
                l.append(temp.val)
                temp = temp.next
        return l

# driver code
solution = Solution()
head, inp = get_input()
head1 = deepcopy(head)
print(f"Original input list: {inp}", end = "")
print()
head = solution.reverseList(head)
print(f"Approach 1: Iterative: Reverse list: {solution.display(head)}")
head1 = solution.reverseList_recursive(head1)
print(f"Approach 2: Recursive: Reverse list: {solution.display(head1)}")
