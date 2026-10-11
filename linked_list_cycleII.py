#Find if the singly linked list has a cycle and return the node where the cycle begins
#Time complexity O(n) traverse the linked list once
#Space complexity O(1) only use pointers

#Aproach : Slow and fast pointers 

class ListNode: 
    def __init__(self, x, next=None):
        self.val = x
        self.next = next
    
def detect_cycle(head):
    slow = head 
    fast = head

    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:  #cycle detected
            break 
    else: 
        return None

#Detecting the start of the cycle
    slow = head 
    while (slow != fast ):
        slow =slow.next
        fast =fast.next

    return slow 


    
import unittest

class TestDetectCycle(unittest.TestCase):

    def test_no_cycle(self):
        head = ListNode(1, ListNode(2))
        self.assertIsNone(detect_cycle(head))

    def test_single_node_cycle(self):
        head = ListNode(1)
        head.next = head

        self.assertIs(detect_cycle(head), head)

    def test_cycle_in_middle(self):
        head = ListNode(1)
        second = ListNode(2)
        third = ListNode(3)

        head.next = second
        second.next = third
        third.next = second

        self.assertIs(detect_cycle(head), second)


if __name__ == "__main__":
    unittest.main()

