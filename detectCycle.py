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
    # traversing the entire list two pointers fast and slow, fast moves two nodes at a time and
    # slow one at a time, if these pointers meet that is an indication of a cycle being present.
    # resetting the slow pointer to the head and moving both pointers one node at a time.
    # at the node these two pointers meet is where the cycle begins, return the node.
    def detectCycle(self, head):
        slow, fast, flag = head, head, False
        # detecting cycle
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
        # if not cycle
        if not flag:
            return None
        # finding node where cycle begins
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow
