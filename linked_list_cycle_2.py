# // Time Complexity : O(n) where n stand for length of the list
# // Space Complexity : O(1) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach 

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = fast = head
        flag = True
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast: break
        
        if not fast or not fast.next: return None
        
        if slow == fast:
            temp = slow
            cur = head
            while cur != temp:
                cur = cur.next
                temp = temp.next
            
            return cur
        return None