# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        # brute force save the list ndoes in a stack and pop the values and for each node make sure the next of the node is null 
        # and attach it one and then one 
        # tc : O(n) sc also O(n) as we save the each node in the stack

        # optimal approach : 1-2-3, isolating each node 1 , 2-3 where 2-3 ... will be saved in a temp so we don't use it, 
        # and save the 1 as the prev node , in the iteration keep isolating each node and put the prev node next to the curr node so 2-1, next 3-2-1, next 4-3-2-1 etc etc
        # tc : O(n)
        # sc : O(1) 

        prev = None # intially setting prev as None
        curr = head

        while curr is not None:
            # Store the next node to avoid losing the rest of the list
            temp = curr.next

            # Reverse the current node's pointer
            curr.next = prev

             # Move the pointers one step forward
            prev = curr
            curr = temp

        return prev

        
