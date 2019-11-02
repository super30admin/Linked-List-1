# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x

#         self.next = None
#brute force -- get the number of nodes get the nth node and the replace the nth node
# we have 2 pointers - slow and fast and move the fast pointer to right by n + 1 elements  and this way we can access the nth element from last with slow pointer
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        #edge case 1
        if not(head):
            return
        #edge case 2 - where the head.next element is not dummy
        dummy = ListNode(0)
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0
        while count <= n:
            fast = fast.next
            count += 1
        while fast:
            slow=slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next