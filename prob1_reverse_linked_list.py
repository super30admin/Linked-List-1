# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
        """
        Time Complexity: O(n)
        Space Complexity: O(1)
        Did this code successfully run on Leetcode: Yes 

        Any problem you faced while coding this: No
        Your code here along with comments explaining your approach:
        The approach:
            - Move towards the end of the list using recursion stack
            - we will have a base conditon where the if the next node is null 
            then return head
            - so once we get out of the last recursion stack 
                - head is at n-2 and head.next is at n-1 (if the length = n)
                - now we assign the next node of n-1 = n-2
                and n-2.next should be None since we want to assign that to n-3 in the recursion
                (also don't want a cycle linked list)
            - return the Node at the end of the recursion function
        """        

    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        res = self.helper(head)
        return res
    
    def helper(self, head):
        if head == None or head.next == None:
            return head
        result = self.helper(head.next)
        head.next.next = head
        head.next = None
        return result
