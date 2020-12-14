# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# Approach 1: One pass using two pointers
# We will use two pointers. The first pointer advances the list by n+1 steps from the beginning, while the second pointer starts from the beginning of the list. Now, both pointers are exactly separated by n nodes apart. We maintain this constant gap by advancing both pointers together until the first pointer arrives past the last node. The second pointer will be pointing at the nth node counting from the last. We relink the next pointer of the node referenced by the second pointer to point to the node's next next node.

# Time Complexity: O(n) where is n = number of nodes
# Space Complexity: O(1)

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        if head == None or head.next == None:
            return None
        
        dummy = ListNode(-1)
        dummy.next = head
        start = dummy
        end = dummy
        
        for i in range(n+1):
            end = end.next
            
        while end != None:
            start = start.next
            end = end.next
            
        start.next = start.next.next
        return dummy.next
        