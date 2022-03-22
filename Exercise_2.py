 
    # 19. Remove Nth Node From End of List

    # Time Complexity : O(n)
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : Yes
    # Any problem you faced while coding this : No

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        fakeNode = ListNode()
        fakeNode.next = head
        count = 0
        fast=fakeNode
        slow=fakeNode
        while(count<n):
            count += 1
            fast = fast.next
            
        while fast.next != None:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next

        return fakeNode.next
            