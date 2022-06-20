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

class TreeNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def removeNthFromEnd(self, head, n: int):
        dummy = TreeNode(-1)
        slow = dummy
        fast = dummy
        dummy.next = head
        temp = 0
        while temp <= n:
            fast = fast.next
            temp += 1
        while fast:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next

    def printList(self):
        temp = self.removeNthFromEnd(check, 2)
        while temp:
            print(temp.val, end=" ")
            temp = temp.next


check = TreeNode(1)
check.next = TreeNode(2)
check.next.next = TreeNode(3)
check.next.next.next = TreeNode(4)
check.next.next.next.next = TreeNode(5)
Solution().printList()


# class TreeNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# class Solution:
#     def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
#         temp_count = 0
#         temp = head
#         while temp:
#             temp_count += 1
#             temp = temp.next
#         count = 0
#         if temp_count - count == n:
#             head = head.next
#             return head
#         else:
#             temp1 = head
#             while temp1:
#                 if temp_count - count == n:
#                     prev.next = temp1.next
#                     return head
#                 prev = temp1
#                 temp1 = temp1.next
#                 count += 1
#
#     def printList(self):
#         temp = self.removeNthFromEnd(check, 2)
#         while temp:
#             print(temp.val, end=" ")
#             temp = temp.next


# check = TreeNode(1)
# check.next = TreeNode(2)
# check.next.next = TreeNode(3)
# check.next.next.next = TreeNode(4)
# check.next.next.next.next = TreeNode(5)
# Solution().printList()
