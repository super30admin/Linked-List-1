'''
## Problem 19: Remove nth node from end of the list.

## Author: Neha Doiphode
## Date:   07-16-2022

## Description
    Given the head of a linked list, remove the nth node from the end of the list and return its head.

## Examples:
    Example 1:
        Input: head = [1,2,3,4,5], n = 2
        Output: [1,2,3,5]

    Example 2:
        Input: head = [1], n = 1
        Output: []

    Example 3:
        Input: head = [1,2], n = 1
        Output: [1]

## Constraints:
    The number of nodes in the list is sz.
    1 <= sz <= 30
    0 <= Node.val <= 100
    1 <= n <= sz

## Follow up: Could you do this in one pass?

## Time complexity: O(n), where n is number of nodes in the linked list.
                          Since we traverse the linked list once.

## Space complexity: O(1), since in both approaches we did not use any auxiliary space.
                         Approach 1 uses counter but space for it is constant being an integer.
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
    print("Enter nth position from the end of the list(the node at which we want to remove from the linked list): ")
    nth = int(input())
    print()
    return head, nth, inp

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head == None:
            return None

        count = 0
        temp = head

        while temp:
            count += 1
            temp = temp.next

        count = count - n - 1

        if count < 0:
            head = head.next

        elif count == 0:
            head.next = head.next.next

        else:
            temp = head
            while count:
                count -= 1
                temp = temp.next

            if temp != None and temp.next != None:
                temp.next = temp.next.next


        return head

    def removeNthFromEnd_without_counter(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head == None:
            return []

        first = head
        second = head

        for _ in range(n):
            first = first.next

        if first == None:
            head = head.next

        else:
            while first.next != None:
                second = second.next
                first = first.next
            second.next = second.next.next

        return head

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
head, nth, inp = get_input()
head1 = deepcopy(head)
nth1 = deepcopy(nth)
print(f"Original input list: {inp}", end = "")
print()
head = solution.removeNthFromEnd(head, nth)
print(f"Approach 1: With counter(from first node): Output list after removing {nth}th node: {solution.display(head)}")
head1 = solution.removeNthFromEnd_without_counter(head1, nth1)
print(f"Approach 2: Without counter(from first node): Output list after removing {nth}th node: {solution.display(head)}")
