# Time Complexity : O(n), n is no of nodes in the given list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA 

# Your code here along with comments explaining your approach:
# using two pointers - fast and slow
# the idea is to give a heads up to fats by the given n
# then we increment them both till fast reaches the end
# but remember we have to start with a dummy node, so that at the end slow is 1 node behind the one we have to delete
# and we can change slow's next to the next to next, this will remove the node on nth number



# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: Optional[ListNode]
        :type n: int
        :rtype: Optional[ListNode]
        """
        if head is None:
            return head
        
        # dummy node at the beginning, so that we can handle deleting head
        dummy = ListNode(-1)
        dummy.next = head

        slow = dummy
        fast = dummy
        count = 0

        # increment fast until it we reach the count from beginning of the list
        while (count <= n):
            fast = fast.next
            count += 1
        
        # now fast is n steps ahead of slow
        # increment fast and slow, so that they reach the end of the list
        while(fast is not None):
            slow = slow.next
            fast = fast.next

        # now slow is at the node that we have to delete
        slow.next = slow.next.next

        return dummy.next
