"""
Time Complexity : O(n) where n is the number of nodes in the Linked List.
Space Complexity : O(1) as no extra data structure is used
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
We need to reverse the Linked List that means each of the node should point to its previous node.
This can be possible by having three pointers prev, curr and fast.
Initially prev will be None, curr is pointing to the head of the Linked List and fast is pointing to the head.next
and then iterating through all the nodes making sure each node points to its previous node and then return the last node as head.
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #Edge case if Linklist is None or Linklist has only one member then return head
        if head == None or head.next == None:
            return head
        
        prev = None
        curr = head
        fast = head.next
        
        while(fast != None):
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        
        curr.next = prev
        
        return curr
