# Time Complexity :
# O(N) --> 1 Pass

# Space Complexity :
# O(1)

# Did this code successfully run on Leetcode :
# Yes

# Any problem you faced while coding this :
# No

# Your code here along with comments explaining your approach

# I have used sliding window approach to solve this problem
# I used two pointers slow and fast, Initially both pointing to head
# Then i moved fast pointer untill the distance between slow and fast pointer is n(n is the nth node from the end of the list)
# In this way i created a window 
# Now we move window by one till fast hits last node
# Now the slow pointer will be pointing to the node which is one before the node to be deleted
# now we point next of slow node to the node next to node to be deleted

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # 1 Pass Solution
        # TC: O(n) --> 1 pass
        # SC: O(1)
        
        dummy = ListNode(-1, head)
        
        slow = dummy
        fast = dummy
        count = 1
        
        while (count <= n):
            fast = fast.next
            count += 1
        
        while (fast.next is not None):
            fast = fast.next
            slow = slow.next
            
        slow.next = slow.next.next
        return dummy.next