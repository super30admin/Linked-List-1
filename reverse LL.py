# Time Complexity : O(N)
# Space Complexity : O(1)

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def reverseList(self, head):
        
        prev = None
        curr = head
        while curr:
            forw = curr.next
            curr.next = prev
            prev = curr
            curr = forw
        return prev
    