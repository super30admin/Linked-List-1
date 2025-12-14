# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


# Your code here along with comments explaining your approach
# Use two pointers with a dummy node to handle edge cases.
# Move the fast pointer n steps ahead, then move both pointers together.
# When fast reaches the end, slow will be just before the node to remove.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head == None:
            return None
        curr = ListNode(0)
        curr.next = head
        slow = curr
        fast = curr
        for i in range(n):
            fast = fast.next
        while fast and fast.next != None:
            slow = slow.next
            fast = fast.next
        temp = slow.next
        slow.next = slow.next.next
        temp.next=None
        return curr.next
        

        