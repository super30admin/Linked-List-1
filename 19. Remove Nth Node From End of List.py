"""
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Follow up: Could you do this in one pass?

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        """
        The first pointer advances the list by n+1n+1 steps from the beginning, while the second pointer starts from the beginning of the list. Now, both pointers are exactly separated by nn nodes apart. We maintain this constant gap by advancing both pointers together until the first pointer arrives past the last node. The second pointer will be pointing at the nnth node counting from the last. We relink the next pointer of the node referenced by the second pointer to point to the node's next next node.


    """
        # Run Time Complexity: O(N)
        # Space Complexity: O(1)
        dummy = ListNode(0)
        dummy.next = head
        p1 = dummy
        p2 = dummy
        
        for i in range(n):
            p1 = p1.next
            
        while(p1.next != None):
            p1 = p1.next
            p2 = p2.next

        after_rem = p2.next.next
        p2.next.next  = None
        p2.next = after_rem
        return dummy.next
            
            
        