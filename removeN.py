# // Time Complexity : O(n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : Egde cases remaining
# // Any problem you faced while coding this :No


# // Your code here along with comments explaining your approach
# 2 pass


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        if head == None:
            return []
        
        
        dummy=ListNode(-1)
        dummy.next = head
        counter = 0
        root = dummy
        
        while root != None and root.next != None:
            root= root.next
            counter=counter+1
        
        root = dummy
        reach = counter - n 
        i=1
        while i <= reach:
            root = root.next
            i+=1
        root.next = root.next.next
        
        return head
            
            
        