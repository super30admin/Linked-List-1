// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach: storing previous and next.


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head == None:
            return None
        prev = None
        next = ""
        
        while next != None:
            next = head.next
            head.next = prev
            prev = head
            
            if next != None:
                head = next
            else:
                return head
