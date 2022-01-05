# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
# Time: O(n)
# SPace: O(1)
class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        slow = head
        fast = head
        # We don't need to check for None condition with slow here
        while fast != None and fast.next != None:
            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                break
        if fast == None or fast.next == None:
            return None
        else:
            start = head
            while start != slow:
                start = start.next
                slow = slow.next
            return slow
                
        
