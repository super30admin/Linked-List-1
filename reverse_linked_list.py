#Problem : Given the head of a singly linked list, reverse the list, 
# and return the reversed list.

#Approach : 3Pointer Interative Approach 
# curr - initially head, prev - initially none, next_node - saves the next node 
#Time Complexity O(n) traversing every node
#Space Complexity O(1) only use 3 pointers

import unittest

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def reverse_linked_list(head):
    prev = None
    curr = head 

    while curr: 
        next_node = curr.next #saving the value before changing the direction
        curr.next = prev
        prev = curr
        curr = next_node

    return prev


class TestReverseList(unittest.TestCase):

    def test_empty_list(self):
        self.assertIsNone(reverse_linked_list(None))

    def test_single_node(self):
        head = ListNode(1)
        result = reverse_linked_list(head)
        self.assertEqual(result.val, 1)

    def test_multiple_nodes(self):
        head = ListNode(1, ListNode(2, ListNode(3)))
        result = reverse_linked_list(head)

        self.assertEqual(result.val, 3)
        self.assertEqual(result.next.val, 2)
        self.assertEqual(result.next.next.val, 1)
        self.assertIsNone(result.next.next.next)


if __name__ == "__main__":
    unittest.main()