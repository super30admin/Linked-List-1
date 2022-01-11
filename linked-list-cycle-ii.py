# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
# Time Complexity: O(n)
# Space Complexity: O(n)
class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        visited = set()
        temp = head
        while temp is not None:
            if temp in visited:
                return temp
            visited.add(temp)
            temp = temp.next