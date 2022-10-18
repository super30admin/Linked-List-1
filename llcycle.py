'''
Time Complexity: O(n)
Space Complexity: O(1)
'''
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
        slow = fast = head
        flag = 0
        while(fast and fast.next):
            slow = slow.next
            fast = fast.next.next
            if(slow==fast):
                flag = 1
                fast = head
                break
        if(flag == 1):
            while(slow != fast):
                slow = slow.next
                fast = fast.next
            return slow
        return None
        
