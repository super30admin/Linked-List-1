# Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :No


# // Your code here along with comments explaining your approach

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head, n):
        # creating a dummy node (case where head needs to be removed)
        dummy = ListNode(0)
        dummy.next = head
        # 2 ptrs slow
        slow = dummy
        # and fast
        fast = dummy
        count = 0
        # putting the fast pointer till n+1 node
        # so the distance between slow and fast pointers is n
        while (count <= n):
            fast = fast.next
            count += 1
        # slow will reach just a node before nth node
        while (fast is not None):
            slow = slow.next
            fast = fast.next
        # removing nth node
        slow.next = slow.next.next
        # returning head
        return dummy.next
