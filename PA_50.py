#LC 142 - Linked List Cycle II
#Time Complexity - O(n)
#Space Complexity - O(1)
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return None
        
        def getInt(head):
            slow = head
            fast = head
            while fast and fast.next:
                fast = fast.next.next
                slow = slow.next
                if slow == fast:
                    return slow
            return None
        node = getInt(head)
        if node == None:
            return None
        slow = head
        fast = node
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow
    