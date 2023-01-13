# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :Yes       
# Any problem you faced while coding this :No

class Solution(object):
    def removeNthFromEnd(self, head, n):
        temp=head
        slow=head
        for i in range(n):
            temp=temp.next
        if(temp is None):
            return head.next
        while(temp.next!=None):
            slow=slow.next
            temp=temp.next
        slow.next=slow.next.next
        return head