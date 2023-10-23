# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        """
        Overall approach:  
          BRUTE FORCE with 2 passes and use a dummy head.
          First count the number of the nodes in the linked list = L.
          Then remove the (L - n + 1)th element from the list.
         
		Time Complexity: O(n) - we do 2 passes
        Space Complexity: O(1) - we use constant extra space
        Did this code successfully run on Leetcode: Yes
        Any problem you faced while coding this: No
        """
        
        # Approach 1: BRUTE FORCE with 2 passes and use a  dummy head 
        # Count elements and remove the (length of array - n)th element
        dummy = ListNode(None) # list with 1 node, or removing the head of the list 
        dummy.next = head
        num_nodes:int = 0 # Length of the linked list

        curr = head
        while curr:
            num_nodes += 1
            curr = curr.next


        # Remove num_removeTH element from the list
        # NOTE: The actual element to be removed it num_remove + 1. 
        # But since the array processing starts from 0, the math works out.
        num_remove = num_nodes - n 
        print(f"Count of nodes = {num_nodes} num_remove={num_remove}")

        # It is better to use FOR LOOP (instead of while curr:) since we stop as soon as we reach the element to be removed
        curr = dummy
        for i in range(num_remove): 
             print(f"i={i}") 
             curr = curr.next
        curr.next = curr.next.next
        
        return dummy.next



