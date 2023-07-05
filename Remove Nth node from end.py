# Time Complexity : O(n)
# Space Complexity : O(1)

# The code ran on LeetCode

# Add a dummy node at the beginning of the list to handle the case of removing the head node efficiently. Initiate two pointers at the dummy node and move the fast pointer by n steps. 
# This will ensure the gap between slow and fast pointer to be n. Now move the slow and fast pointers simultaneously until fast reaches the end of the list. Remove the node to the right of slow pointer

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        dummyNode = ListNode(-1)
        dummyNode.next = head
        slow = fast = dummyNode

        while n > 0 and fast:
            fast = fast.next
            n-=1

        while fast and fast.next:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next
        return dummyNode.next

