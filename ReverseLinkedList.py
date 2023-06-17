# Time Complexity : O(n) for each operation.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is to use a two pointer one to create and swap the connection using the temp node.

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        temp=head
        prev=None
        while(temp!=None):
            
            temp1=temp.next
            temp.next=prev
            prev=temp
            temp=temp1
        return prev