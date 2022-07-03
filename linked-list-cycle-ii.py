# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :no


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Floyd's Tortoise and Hare
        if head==None or head.next== None:
            return None
        print("HI")
        slow=head
        fast=head
        flag=False
        
        while fast!=None and fast.next!=None:
            print(slow.val)
            slow=slow.next
            fast=fast.next.next
            if slow==fast:
                flag=True
                break
        
        if flag==False:
            return None
        
        print(slow.val,fast.val)
        fast=head 
        while slow!=fast:
            slow=slow.next
            fast=fast.next
        
        return fast