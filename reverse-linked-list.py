# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        # Approach 1 - Iterative using 3 ptrs
        # TC: O(n), SC: O(1)

        if head is None or head.next is None:
            return head

        # Approach 1 - Iterative using 3 ptrs
        # TC: O(n), SC: O(1)
        prev = None
        curr = head
        fast = curr.next

        while fast != None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next

        curr.next = prev

        return curr

        # # Approach 2 - using recursion TC: O(n), SC :O(h) where h is height of recursion stack. Wrost case O(n)
        # # base case
        # if head is None or head.next is None:
        #     return head  # this is called only when head is at last element. So returns that head

        # # logic
        # # stores the result of recursive call. The values comes from the base case logic that was hit for the last node. It is never updated because other nodes never hit the base case.
        # result = self.reverseList(head.next)
        # # print(result)
        # head.next.next = head
        # head.next = None

        # return result

        #  # Approach 3 - 3 ptrs using recursion  TC: O(n), SC :O(h) where h is height of recursion stack.

        # def helper(curr, prev):
        #     # base case
        #     if curr is None:
        #         return prev

        #     # logic
        #     fast = curr.next
        #     curr.next = prev
        #     prev = curr
        #     curr = fast

        #     return(helper(curr, prev))

        # return helper(head, None)
