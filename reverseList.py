# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :Yes       
# Any problem you faced while coding this :No
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        prev=None
        curr=head
        while(curr!=None):
            temp=curr.next
            curr.next=prev
            prev=curr
            curr=temp
        return prev