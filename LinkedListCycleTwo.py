# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Using Two pointer approach (fast and slow pointers) to detect the cycle
# After detecting reset one of the pointer to determine the start of the cycle
# Time Complexity is O(n)
# Space Complexity is O(1)
class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None:
            return None
        slow = head
        fast = head
        hasCycle = False
        
        while(fast and fast.next):
            slow = slow.next
            fast = fast.next.next
            if(slow == fast):
                hasCycle = True
                break
            
            
        
        if(not hasCycle):
            return None
        
        slow = head
        while(slow!=fast):
            slow = slow.next
            fast = fast.next
        return slow