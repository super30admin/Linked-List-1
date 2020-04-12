"""
// Time Complexity : O(n) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Ambiguity about complexity
// Your code here along with comments explaining your approach
Algorithm explanation
1) Detect the cycle using slow and fast pointer approach ie run slow pointer 
1 node ahead and fast 2 nodes ahead, whenever they meet, we have the cycle
2) According to pure math, distance covered slow is twice the fast, which 
also results in a understanding that distance covered by head to the point
where cycle starts will be equal to distance from detection point to cycle
start point
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                #cycle detected
                # increment head and node of cycle detection untill they meet
                curr = head
                while curr!= fast:
                    curr = curr.next
                    fast = fast.next
                return curr
        return None