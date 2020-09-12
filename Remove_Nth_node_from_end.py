// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach:slow and fast pointer. Slow at head and fast pointer at n distance fom head. 

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        if head == None:
            return None
        
        temp = ListNode()
        temp.next = head
        
        slow = temp
        fast = temp
        
        for i in range(0,n):
            fast = fast.next
            
        
        while fast.next != None:
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next
        return temp.next
        
