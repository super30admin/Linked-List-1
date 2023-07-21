# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None


# Your code here along with comments explaining your approach

#Brute Force Approach


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        
        prev = None
        curr = head
        temp = head.next

        while temp is not None:
            curr.next = prev
            prev = curr
            curr = temp
            temp = temp.next 
        curr.next = prev
        return curr
    