class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    # Time Complexity : O(n), where n is the length of the list.
    # Space Complexity: O(n), where n is the length of the list.
    # Did this code successfully run on Leetcode : yes
    # Any problem you faced while coding this : no

    # Your code here along with comments explaining your approach

    # recursively reversing links of all the nodes in a list from the end
    # of the list and returning the new head, last node of the original list.
    def reverseListRecursive(self, head):
        # base case
        if head == None or head.next == None:
            return head
        # logic
        r = self.reverseListRecursive(head.next)
        head.next.next = head
        head.next = None
        return r

#------------------------------------------------------x---------------------------------------------------------------#

    # Time Complexity : O(n), where n is the length of the list.
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : yes
    # Any problem you faced while coding this : no

    # Your code here along with comments explaining your approach

    # iterative solution to reverse a linked list, using three pointers, where
    # temporarily preserving the next and switch links of two nodes accordingly.
    def reverseListIterative(self, head):
        # edge case
        if head == None or head.next == None:
            return head
        # logic
        prev, next = None, head.next
        while next != None:
            head.next = prev
            prev = head
            head = next
            next = head.next
        head.next = prev
        return head
