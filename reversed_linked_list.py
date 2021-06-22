# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution(object):
    def reverseList(self, head):
        #         Check base condition
        if head == None:
            return None
        #         Assign prev current and fast pointer on linked list
        prev = None
        current = head
        fast = head.next

        #       we will be moving previous pointer to current and current next to the previous
        while fast != None:
            current.next = prev
            prev = current
            current = fast
            fast = fast.next

        current.next = prev

        return current

        """
        :type head: ListNode
        :rtype: ListNode
        """
