# // Time Complexity :O(n) 
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach




# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if head==None or head.next == None or head.next.next==None:
            return None
        slow=head
        fast=head
        flag=False
        while fast.next is not None and fast.next.next is not None:
            slow=slow.next
            fast=fast.next.next
            
            
            
            if slow==fast:
                flag=True
                break
        if flag==False:
            return None
        else:
            fast=head
            while fast is not slow:
                fast=fast.next
                slow=slow.next
        return slow
            
                
        