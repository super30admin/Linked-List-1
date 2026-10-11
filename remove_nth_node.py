#Remove Nth Node From End of List
#2 pointers slow and fast 
#Time complexity O(n) traverse the linked list once 
#Space complexity O(1) only use pointers
class ListNode:
    def __init__(self, val = 0, next=None):
        self.val = val
        self.next = next 
    
def remove_nth_node(head, n):
        dummy = ListNode(0, head)

        slow = dummy
        fast = dummy 
        #move fast n+1 steps ahead
        for _ in range(n+1):
            fast = fast.next
        
        #move both pointers
        while fast: 
            slow = slow.next
            fast = fast.next
        
        #remove the node
        slow.next = slow.next.next
        return dummy.next


import unittest

class TestRemoveNthNode(unittest.TestCase):

    def test_single_node(self):
        head = ListNode(1)
        result = remove_nth_node(head, 1)
        self.assertIsNone(result)

    def test_remove_last_node(self):
        head = ListNode(1, ListNode(2))
        result = remove_nth_node(head, 1)
        self.assertEqual(result.val, 1)
        self.assertIsNone(result.next)

    def test_remove_middle_node(self):
        head = ListNode(1, ListNode(2, ListNode(3)))
        result = remove_nth_node(head, 2)
        self.assertEqual(result.val, 1)
        self.assertEqual(result.next.val, 3)


if __name__ == "__main__":
    unittest.main()

