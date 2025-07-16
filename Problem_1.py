'''
206 Reverse Linked List
https://leetcode.com/problems/reverse-linked-list/

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

Solution:
1. Iterative using three pointers:
Set up prev, curr, fast pointers to point to Null, head, and head.next.
prev = points to the node before the current node
fast = points to the node after the current node

Traverse the list one step at a time and do the following steps:
a) Point curr.next to prev
b) Move prev one step ahead to curr
c) Move curr one step ahead to fast
d) Move fast one step ahead

https://youtu.be/LbtCGPIuztg?t=3655

Time: O(N), Space: O(1)

2. Recursive using two-pointers:
Set up prev, curr pointers to point to Null, head respectively and recurse using

recurse(curr, prev)
Step 1: Let fast = curr.next (node after curr)
            curr.next = prev (point curr to prev)
Step 2: Now move bot h prev and curr one step ahead
        curr = fast (move curr one step ahead)
        prev = curr (move prev one step ahead)

We hit the base case at the end of list, where
curr = None, prev = tail (last node of list).
At this point, we simple return the prev node
Time: O(N), Space: O(N)

'''
from linked_list import *

def reverse_list_iterative(head):
    ''' T: O(N), S: O(1) '''
    if not head or not head.next:
        return head
    prev = None
    curr = head
    fast = curr.next
    while fast:
        curr.next = prev
        prev = curr
        curr = fast
        fast = fast.next
    # Here, curr = tail, fast = None
    curr.next = prev
    return curr

def reverse_list_recursive(head):
    ''' T: O(N), S: O(N) '''
    def recurse(curr, prev):
        if not curr:
            # Here, prev = tail, curr = None
            return prev

        fast = curr.next
        curr.next = prev

        prev = curr
        curr = fast

        return recurse(curr, prev)

    if not head or not head.next:
        return head
    prev = None
    curr = head
    tail = recurse(curr, prev)
    return tail

def reverse_list(head, method="iter"):
    if method == "iter":
        return reverse_list_iterative(head)
    elif method == "recur":
        return reverse_list_recursive(head)
    else:
        print("Undefined method")


def run_reverse_list():
    tests = [([1,2,3,4,5],[5,4,3,2,1]), ([1],[1]), ([1,2],[2,1]), ([],[])]
    for test in tests:
        head, ans = test[0], test[1]
        for method in ["iter","recur"]:
            sll = build_linked_list(head)
            print(f"\nSLL = {sll.to_array()}")
            reverse_sll = reverse_list(sll, method)
            print(f"Method ({method}): Reverse SLL = {reverse_sll.to_array()}")
            print(f"Pass: {ans == reverse_sll.to_array()}")

run_reverse_list()