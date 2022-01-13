# Time Complexity :
# O(N) --> One Pass

# Space Complexity :
# O(1)

# Did this code successfully run on Leetcode :
# Yes

# Any problem you faced while coding this :
# No

# Your code here along with comments explaining your approach

# I have used three pointers (prev, curr, next) to solve this problem
# Intially prev is pointing to null,
# curr is pointing to head, and
# next is pointing to head.next
# then i will point curr.next to prev
# then i will move prev to curr
# then i will move curr to next
# then i will move next to next.next
# We will keep moving this until curr reaches null
# we will then return prev as it will pointing to last node which is head of new reversed LL.


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Iterartive
        # TC: O(N)
        # SC: O(1)
        
        if (head is None or head.next is None):
            return head
        
        prev = None
        curr = head
        nxt = curr.next
        
        while(curr is not None):
            curr.next =prev
            prev = curr
            curr = nxt
            if(nxt is not None):
                nxt = nxt.next
                
        return prev