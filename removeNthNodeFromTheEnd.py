# Time Complexity : O(n), where n is the length of the list.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

# Your code here along with comments explaining your approach
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    # This problem is solved using two pointers where one pointed is put
    # n+1 nodes ahead and then both nodes are traversed linearly. at this
    # point one pointer is right behind the node to remove, change links.
    def removeNthFromEnd(self, head, n):
        if not head:
            return head
        # dummy node init
        dummy, dummy.next = ListNode(0), head
        # pointers init
        slow, fast, count = dummy, dummy, 0
        # moving fast pointer n+1 nodes ahead of slow
        while count <= n:
            fast = fast.next
            count += 1
        # traversing to the end of the list
        while fast != None:
            slow = slow.next
            fast = fast.next
        # slow at one node before the node to remove, change links. Voila.
        slow.next = slow.next.next
        return dummy.next
