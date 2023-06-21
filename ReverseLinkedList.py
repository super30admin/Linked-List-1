# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :No
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
         prev,curr = None,head
         while curr:#while next pointer is not null
            next_temp = curr.next
            curr.next = prev
            prev = curr
            curr = next_temp   
         return prev