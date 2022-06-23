# TC : O(n)
# SC : O(1)
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
        if not head : return head
        
        fast = head
        slow = head
        cycle = False
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                cycle = True
                break
                
        if not cycle:
            return None
        
        slow = head
        while(slow!=fast):
            slow = slow.next
            fast = fast.next
            
        return slow