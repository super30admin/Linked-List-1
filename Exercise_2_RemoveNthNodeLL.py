# Time Complexity :
# O(N)

# Space Complexity :  
# O(1)  



# Approach:
# Make a dummy node, initiate "slow" and "fast" pointers at dummy.
# Then advance fast pointer "n" times. At this stage, we have created a gap of n nodes between slow and fast
# To address the nth node from last, we need to move both "slow" and "fast" untill fast points to None, so that
# "slow" will eventually point to node just before the "node to be deleted".


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        if not head:
            return
    
        count = 0
        
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy
        

        #separate slow and fast by a gap of n
        while (count <=n):
            fast = fast.next
            count = count+1

        # then advance "slow" pointer untill "fast" points to None
        while(fast):
            slow = slow.next
            fast = fast.next

        # "slow" is now one node before the "Node to be deleted"
        slow.next = slow.next.next

        return dummy.next
        