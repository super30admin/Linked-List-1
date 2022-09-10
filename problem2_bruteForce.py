"""
Time Complexity : O(n) where n is the number of nodes in the Linked List.
Space Complexity : O(1) as no extra data structure is used
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
The brute force approach will be :
1. Add a dummy Node to the Linked List. This will help if head Node needs to be removed
2. Find the length of the Linked List.
3. Find the n-1 Node. (Traverse through the Linked List till length - n -1)
4. Remove the nth node. temp.next = temp.next.next
5. Return head.next as no need to return the dummy node
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        #Edge Case
        if head == None:
            return []
        
        #Add a dummy Node
        dummyNode = ListNode(-1)
        dummyNode.next = head
        head = dummyNode
        
        #Calculate the length of the Linked List
        length = 0
        temp = head
        while temp != None:
            length += 1
            temp = temp.next
        
        #Iterate to find the n-1th node
        temp = head
        for i in range(length - n - 1):
            temp = temp.next

        #Remove the nth node
        temp.next = temp.next.next
        
        return head.next
        