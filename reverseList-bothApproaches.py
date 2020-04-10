# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

"""Recursive approach"""

#Accepted by leetcode
# Time Complexity :O(N)
# Space Complexity :O(N) as we are using recursive stack in memory

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head == None or head.next == None:
			return head
		rev = self.reverseList(head.next)
		head.next.next = head
        head.next = None
        return rev


"""Iterative approach"""

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

#Accepted by leetcode
# Time Complexity :O(N)
# Space Complexity :O(1) as we are just changing the links

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return None
        prev = None
        curr = head
        next = curr.next
        while next != None:
            curr.next = prev
            prev = curr
            curr = next
            next = next.next
        curr.next = prev
        return curr