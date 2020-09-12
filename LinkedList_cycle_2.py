// Time Complexity :O(N) asymptotically
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach: floyd's algorithm. slow, fast and intersection point


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if head == None:
            return None
        
        p1 = head
        p2 = self.intersect(head)
        
        if p2 == None:
            return None
        
        while p1!=p2 :
            p1 = p1.next
            p2 = p2.next
        return p1
    
    def intersect(self,head):
        slow = head
        fast = head
        
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                return slow
        return None
        
