'''
## Problem 142: Linked list cycle II

## Author: Neha Doiphode
## Date:   07-16-2022


## Description:
    Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
    There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
    Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed).
    It is -1 if there is no cycle. Note that pos is not passed as a parameter.

    Do not modify the linked list.

## Examples:
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

## Constraints:
    The number of the nodes in the list is in the range [0, 104].
    -105 <= Node.val <= 105
    pos is -1 or a valid index in the linked-list.

## Follow up: Can you solve it using O(1) (i.e. constant) memory?

## Time complexity: O(n), where n is number of nodes.

## Space complexity: O(1), since we are not using any auxiliary space.

'''
from typing import List, Optional

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

    print("Do you want to introduce a cycle in the linked list?(y/n): ", end = "")
    choice = input()
    print()
    if choice == 'y':
        print(f"Original list: {inp}")
        print("Enter the node at which you want to set the head of the cycle: ", end = "")
        cycle_head = int(input())
        print()
        temp = head
        while temp:
            if temp.val == cycle_head:
                last.next = temp
                break
            temp = temp.next
    elif choice != 'n':
        print("Invalid choice.")
        exit()
    return head, inp

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return
        has_cycle = False

        slow = head
        fast = head


        # We need to check both conditions here because
        # a linked list can be of length even or odd
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                has_cycle = True
                break

        # Once we detect the cycle, we need to find at what node the tail connects to form the cycle
        # To detect the head of the cycle:
        #   1. Rewind slow pointer
        #   2. Now move both with same speed.
        '''
        Mathematical explaination:
            Let's say:
                a = distance from the head of linked list to the head of the cycle.
                b = distance from head of the cycle to the meeting point of slow and fast pointers.
                c = disance from the meeting point of two pointers back to the head of the cycle.

            With that background
                distance covered by slow pointer before it meets the fast pointer = a + b
                distance covered by fast pointer before it meets the slow pointer = a + b + c + b

                So, since fast pointer was moving with double the speed of slow pointer,
                2(a + b) = a + b + c + b
                2a + 2b  = a + 2b + c
                      a  = c

            From above, when we rewind the slow pointer to head, fast pointer is at the meeting point.
            Slow covers distance a to reach the head of the cycle and fast has to cover distance c to reach there.
            since a = c, we need to move them both with equal speed to get the head of the cycle.
        '''
        if has_cycle:
            slow = head
            while slow != fast:
                slow = slow.next
                fast = fast.next
            return slow

        return None

# driver code
solution = Solution()
head, inp = get_input()
print(f"Original input list: {inp}", end = "")
print()
head = solution.detectCycle(head)
if head != None:
    print(f"Cycle is detected.")
    print(f"Head of the cycle: {head.val}")
else:
    print(f"Cycle does not exist")
