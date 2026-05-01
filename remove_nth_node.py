# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : Easy to think of 2pass, but 1pass is tricky

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: Optional[ListNode]
        :type n: int
        :rtype: Optional[ListNode]
        """
        temp=ListNode(0)
        temp.next=head
        c=0
        first=temp
        second=temp

        while(c<=n):
            second=second.next
            c+=1
            
        while(second):
            first=first.next
            second=second.next
        
        first.next=first.next.next        
        
        return temp.next