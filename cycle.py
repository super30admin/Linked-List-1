#Time Complexity: O(N).
#Auxiliary Space: O(1)
#Did this code successfully run on Leetcode :Yes


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
        if head==None:
            return None
        cycle = False
        
        slow = head
        fast = head
        while(fast and fast.next):
            slow=slow.next
            fast = fast.next.next
            if slow==fast:
                cycle = True
                break
        if cycle:
            slow = head
            
            while(slow!=fast):
                slow = slow.next
                fast = fast.next
                
            return slow