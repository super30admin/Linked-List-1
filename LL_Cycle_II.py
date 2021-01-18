# Time complexity: O(N) - Since it's single pass
# Space complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#Algorithm: Floyd's Cycle Detection


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
        slow = head
        fast = head
        flag = False    #to check cycle
        
        #check for cycle
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                flag = True # found cycle
                break
        # No cycle return None        
        if not flag:
            return None
        
		# OR I can move slow to head as well it will going to accept
        fast = head 
        while slow != fast:
            slow = slow.next
            fast = fast.next
            
        return fast
