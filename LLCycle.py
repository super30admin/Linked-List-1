"""
TC: O(n)
SC: O(1)
Leetcode: Success!
Problems: None, just the dynamics behaind the scene on Leetcode.
"""
# Definition for singly-linked list.
class ListNode:
     def __init__(self, x):
         self.val = x
         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if head == None:
            return None
            # initializing two pointers to traverse through the linked list
        slow = head
        fast = head

        # Sanity check to avoid null pointer exception
        while (fast != None and fast.next != None):
            # slow pointer traversing through the linked list
            slow = slow.next

            # jump by two elements
            fast = fast.next.next

            # if the slow and fast pointer meet or are equal then initialize a dummy pointer and let slow and dummy pointer traverse until they don't meet.
            if slow == fast:
                dummy = head
                while (dummy != slow):
                    slow = slow.next
                    dummy = dummy.next
                return slow
        return None

s = Solution()
print("Is the LL cyclic: ",s.detectCycle())
