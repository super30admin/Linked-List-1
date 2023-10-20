# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        dummy=ListNode()
        dummy.next=head
        slow=dummy
        fast=dummy
        count=0
        # to get a gap of n between fast and slow
        while(count<=n):
            count+=1
            fast=fast.next
        while(fast!=None):
            slow=slow.next
            fast=fast.next
        temp=slow.next
        slow.next=temp.next
        temp.next=None
        return dummy.next
