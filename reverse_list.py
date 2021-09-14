# // Time Complexity : O(n) where n stand for length of the two lists 
# // Space Complexity : O(n) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach 

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
#         if not head or not head.next:
#             return head
        
#         reverse = self.reverseList(head.next)
        
#         head.next.next = head
#         head.next = None
        
#         return reverse
    
        # Approach 2
        # TC: O(n)
        # SC: O(1)
        cur = head
        prev = None
        while cur:
            cur.next,prev,cur = prev,cur,cur.next
        
        return prev