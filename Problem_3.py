'''
142 Linked List Cycle II
https://leetcode.com/problems/linked-list-cycle-ii/description/

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

Solution:
1. Brute Force:
Traverse each node and mark each node as visited by storing the node in a hash set. If there is a cycle, we're guaranteed to revisit the same node. If there is no cycle, traversal will reach the end of list (Null) and we declare that there is no cycle.
Time: O(N), Space: O(N)

2. Floyd's cycle detection algorithm (optimal):
Step 1: Initialize two pointers - slow and fast - at the head. Move slow pointer by one step and fast pointer by two steps. If there is a cycle, slow and fast are guaranteed to meet at a node within the cyclic part of the linked list. Go to Step 2. If there is no cycle, fast should reach the end of list (Null) before slow and declare that there is no cycle.

Step 2: If we have reached this point, we are guaranteed that there is a cycle.The objective of this step is to find the first node in the cyclic part. For this, reset the fast pointer to head. Let slow pointer be wherever it is. Now move both slow and fast by one step. They are guaranteed to meet again at the first node in the cyclic part. But why?
Consider a linked list containing a non-cyclic part and cyclic part.
1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11
                    |                     |
                     - - - - - - - - - - -
Let N1 = 1 (head of list)
N2 = 6 (head of cycle)
N3 = 7 (node where slow and fast meet)

Let distance between the head of list (N1) and head of cycle (N2) be = 'a'
If both slow and fast start and head and advance by one and two steps respectively, let them meet at some node N3 in the cylic part of the list. Let
the distance between the head of cycle (N2) and node N3 be = 'b'.
Let the distance between node N3 and head of cycle (N2) be = 'c'.

Since both slow and fast meet at N3,
At N3, t_slow = t_fast
       d_slow/speed_slow = d_fast/speed_fast
       (a + b)/x  = ( a + (b + c) + b)/2x
       2(a+b) = a + 2b + c
       c = a

Thus, at N3, we leave slow at N3 and reset fast to N1. When fast advances by 'a' steps to reach N2, slow also advances by 'a' steps. Since 'c' = 'a', slow must have traveled the remaining part of the cycle from N3 and N2. Thus, after 'a' steps, both fast and slow are guaranteed to be meet N2.

https://www.youtube.com/watch?v=LbtCGPIuztg

Time: O(N), Space: O(1)
'''
from linked_list import *

def detect_cycle(head):
    if not head:
        return None

    has_cycle = False
    slow = head
    fast = head
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
            has_cycle = True
            break

    if not has_cycle:
        return None, -1

    fast = head
    pos = 0 # head of linked list is at position 0
    while slow != fast:
        fast = fast.next
        slow = slow.next
        pos += 1
    return fast, pos # can return either fast or slow

# cycle 1->2->3->4->5->6->7->8->
#             |                |
#             < ---------------
# start = 1, end = 8, cyclic node = 3
def create_cyclic_list(start_num, end_num, cyclic_node_value):
    assert start_num <= cyclic_node_value <= end_num

    for i, val in enumerate(range(start_num,end_num+1)):
        node = ListNode(val)
        if i == 0:
            sll = head = node

        if val == cyclic_node_value:
            cycle_node = node

        sll.next = node
        sll = sll.next

    sll.next = cycle_node
    return head

def run_detect_cycle():
    tests = [(create_cyclic_list(0, 9, 4), 4),
             (create_cyclic_list(10, 19, 12), 12),
             (create_cyclic_list(1, 9, 8), 8),
             (create_cyclic_list(0, 1, 0), 0),
             (build_linked_list([1,2,3,4,5,6,7]), None),
             (build_linked_list([1]), None),
    ]
    for test in tests:
        sll, ans = test[0], test[1]
        node, pos = detect_cycle(sll)
        node_val = node.val if node else None
        print(f"\nNode value and position where cycle begins = {node_val, pos}")
        print(f"Pass: {ans == node_val}")

run_detect_cycle()
