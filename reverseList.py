# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        ## Iterative Method ##
        # TC - O(n).  SC - O(1)
        # Edge Cases - one node , no node
        # current = head
        # prev = None
        # while current!= None:
        #     temp = current.next
        #     current.next = prev
        #     prev = current
        #     current = temp
        # return prev 

        ## recursive logic ##
        # TC - O(n), SC - O(n) for the recursive stack
        ## Key take aways - reversedHead would remain same for all the calls thats the last element from which we revesed the list
        if head == None:
            return None
        # base case
        if head.next == None:
            return head 
        reversedHead = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return reversedHead

        
