
## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if head ==None:
            return head
        temp = ListNode(-1)
        temp.next = head
        fast = temp
        slow = temp
        count = 0
        while count<=n:
            fast = fast.next 
            count = count+1
        while fast!=None: 
            slow = slow.next 
            fast = fast.next 
        slow.next = slow.next.next 
        return temp.next
    #Time complexity: O(n)
    #Space Complexity: O(1)
    #Approach: take two pointers - fast and slow, insert a new dummy value at the head and increment both of them accordingly untill you reach the place where you have to delete the next node.  
        
        
        