## Problem1 (https://leetcode.com/problems/reverse-linked-list/)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head == None:
            return 
        prev = None
        curr = head
        fast = head.next
        while fast!= None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        curr.next = prev
        return curr   
    
    #Time Complexity: O(n) n - number of nodes
    #Space complexity: O(1)
    #Approach: Use three pointers - prev, curr and fast. 