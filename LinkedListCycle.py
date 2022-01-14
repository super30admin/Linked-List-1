# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if head == None:
            return None
        
        slow = head
        fast = head
        flag = False
        while (fast != None and fast.next != None):
            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                flag = True
                break
                
        if not flag:
            return None
        
        fast = head
        while (fast != slow):
            fast = fast.next
            slow = slow.next
        return slow

        
        
        