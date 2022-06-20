# Time Complexity : O(n)
# Space Complexity : O(1);
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#
# Recursive.
# iterate through last but one node recursively, then saves the last node in a variable.
# then connect the next pointers as the recursive stack pops out the nodes.
# then finally return the saved last node.

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def __init__(self):
        self.reverse = None

    def helper(self, head):
        if not head or not head.next:
            return
        self.reverse = head.next
        self.reverseList(head.next)
        head.next.next = head

    def reverseList(self, head):
        if not head or not head.next:
            return head
        self.helper(head)
        head.next = None
        return self.reverse

    def printList(self):
        temp = self.reverseList(check)
        while temp:
            print(temp.val, end=" ")
            temp = temp.next


check = ListNode(1)
check.next = ListNode(2)
check.next.next = ListNode(3)
check.next.next.next = ListNode(4)
check.next.next.next.next = ListNode(5)
Solution().printList()


# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
#
#
# class Solution:
#     def __init__(self):
#         self.reverse = None
#
#     def helper(self, head):
#         if not head or not head.next:
#             return
#         self.reverse = head.next
#         self.reverseList(head.next)
#         head.next.next = head
#         head.next = None
#
#     def reverseList(self, head):
#         if not head or not head.next:
#             return head
#         self.helper(head)
#         return self.reverse
#
#     def printList(self):
#         temp = self.reverseList(check)
#         while temp:
#             print(temp.val, end=" ")
#             temp = temp.next
#
#
# check = ListNode(1)
# check.next = ListNode(2)
# check.next.next = ListNode(3)
# check.next.next.next = ListNode(4)
# check.next.next.next.next = ListNode(5)
# Solution().printList()

# iterative method.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
#
#
# class Solution:
#     def reverseList(self, head):
#         if not head:
#             return None
#         prev = None
#         curr = head
#         next = curr.next
#         while next:
#             curr.next = prev
#             prev = curr
#             curr = next
#             next = next.next
#         curr.next = prev
#         return curr
#
#     def printList(self):
#         temp = self.reverseList(check)
#         while temp:
#             print(temp.val, end=" ")
#             temp = temp.next
#
#
# check = ListNode(3)
# check.next = ListNode(2)
# check.next.next = ListNode(0)
# check.next.next.next = ListNode(-4)
# Solution().printList()
