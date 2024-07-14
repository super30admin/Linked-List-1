#// Time Complexity : O(n) 
# // Space Complexity : O(1)   
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : Yes getting the position was a bit difficult to get.


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow=head
        fast=head 
        flag=False

        while fast!=None and fast.next!=None:
            slow=slow.next
            fast=fast.next.next
            if slow==fast:
                flag=True
                break
        if flag==False:
            return None

        fast=head

        while slow!=fast:
            slow=slow.next
            fast=fast.next
            
        return fast
    
# Approach:
# 1. We will use two pointers slow and fast.
# 2. We will move slow by 1 and fast by 2.
# 3. If there is a cycle, then at some point slow and fast will meet.
# 4. We will move fast to the head and then move them one by one and where they meet is the position we want.