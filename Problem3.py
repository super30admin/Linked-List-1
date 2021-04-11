## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        a = "no cycle"
        if head == None:
            return head
        fast=head
        slow = head    
        hasCycle = False
        while fast!=None and fast.next!=None:
            slow = slow.next
            fast = fast.next.next
            if slow==fast:
                hasCycle = True
                break
                
        if hasCycle == False: 
            return a
        slow = head
        while fast!=slow:
            slow = slow.next 
            fast = fast.next
        return slow
    #Time Complexity: O(n) n = number of nodes
    #Space Complexity: O(1)
    #Approach - Two pointers - Fast and slow set to its head, move your slow with only one step ahead and move your fast pointer with two steps ahead. When they meet it shows the presence of a cycle and then reset slow to head and move fast and slow by one untill they again meet which will find out where the cycle 
            
        