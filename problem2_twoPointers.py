"""
Time Complexity : O(n) where n is the number of nodes in the Linked List.
Space Complexity : O(1) as no extra data structure is used
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
As we need to remove nth Node, we must have reference to the n-1th Node. The idea is to place the slow pointer at the n-1th node when fast pointer reaches to the end of the list.
1. Add a dummy Node, this will help when head node needs to be removed
2. Place slow and fast pointer at the head (dummyNode is the new head).
3. Increment fast pointer n places
4. Increment slow and fast pointers till fast.next == None
5. Remove the nth Node
6. Return the head.next as no need to return the dummyNode 
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
                
        #Add a dummy node
        dummyNode = ListNode(-1)
        dummyNode.next = head
        
        #Declare the pointers
        slow = dummyNode
        fast = dummyNode
        
        #Move the Fast pointer nth places
        for _ in range(n+1):
            fast = fast.next
            
        #Find the n-1th node
        while fast != None:
            slow = slow.next
            fast = fast.next
        
        #Remove the nth Node
        slow.next = slow.next.next
        
        return dummyNode.next
            