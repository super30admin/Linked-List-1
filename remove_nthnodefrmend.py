"""
// Time Complexity : O(n) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
// Your code here along with comments explaining your approach
Algorithm explanation
We use th concept of floyd's algorithm by using slow and fast pointers
Initial configuraition - append dummy node to head of the list and point slow and fast
to dummy
Idea is to advance the fast pointer in such a way that nth node is reached
Then advance the slow and fast pointer till fast pointer doesn't reach null node
node pointed by slow pointer will prev node of node to be deleted
Delete the reference by pointing it's next to next's next
return dummy.next
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(0)
        fast = slow = dummy
        dummy.next = head
        count = 0
        while count <= n:
            fast = fast.next
            count+=1
        
        while fast:
            fast = fast.next
            slow = slow.next
        
        slow.next = slow.next.next
        return dummy.next