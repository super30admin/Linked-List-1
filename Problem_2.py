'''
19 Remove Nth Node From End of List
https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

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

Solution:
1. Brute Force:
Traverse till the end of list, determine length of list K. Assuming, the first node (head node) is at position 1 (1-indexed list), then the node to be removed is at position = K - N + 1. The node prior to the removal node is at position = K - N. Hence, we start from head again and traverse for K -N steps to land at the node prior to the node to be removed. Then, do node.next = node.next.next
Time: O(N), Space: O(1)

2. Two-pointer:
Move the fast pointer N steps ahead. Now initialize the slow pointer to piont to head. Then move both pointer one step at a time until fast reaches the end of list (Null). At this point, slow will be pointing to the node prior to the node to be removed. This approach is slightly better than the brute force approach since we traverse the linked list only once.

https://youtu.be/LbtCGPIuztg?t=1852

Time: O(N), Space: O(1)
'''
from linked_list import *

def remove_nth_from_end(head, n):
    if not head:
        return head

    assert n >= 1, f"n = {n}. The value of n cannot be less than 1"

    dummy = ListNode(-1, head)
    front = dummy
    back = dummy
    count = 0
    while count <= n:
        front = front.next
        count += 1

    while front:
        front = front.next
        back = back.next
    # Here, back should point to the node prior to the removal node
    back.next = back.next.next
    return dummy.next

def run_remove_nth_from_end():
    tests = [([1,2,3,4,5], 2, [1,2,3,5]),
             ([1,2,3,4,5], 3, [1,2,4,5]),
             ([1,2,3,4,5], 1, [1,2,3,4]),
             ([1,2,3,4,5], 5, [2,3,4,5]),
             ([1],1,[]),
             ([1,2],1,[1]),
             ([1,2],2,[2]),
    ]
    for test in tests:
        head, n, ans = test[0], test[1], test[2]
        sll = build_linked_list(head)
        print(f"\nSLL = {sll.to_array()}")
        print(f"Nth node to remove starting from tail = {n}")
        new_sll = remove_nth_from_end(sll,n)
        new_sll = new_sll.to_array() if new_sll else []
        print(f"New SLL = {new_sll}")
        print(f"Pass: {ans == new_sll}")

run_remove_nth_from_end()