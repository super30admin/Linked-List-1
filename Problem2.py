# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    # tc : O(n) 
    # sc : O(1)
    def removeNthFromEnd(self, head, n):
        """
        :type head: Optional[ListNode]
        :type n: int
        :rtype: Optional[ListNode]
        """
        # intution 
        # to find the nth node from end simple logic start a pointer x from the nth node of the start and have a pointer y from the head
        # when x reachs the end , y reaches exactly the nth node form the end 
        # we need exactly one node before the nth node so we can disconnect the connection and rmeove the nthnode
        
        dummy = ListNode(-1) # added a dummy node to handle edge cases like a single node 
        dummy.next = head

        slow = dummy
        fast = dummy

        for i in range(n+1): # moving n times from head, fast will be 1 step after the nth node
            fast = fast.next

        while fast is not None: # and since our fast is one step before nth node it reaches null 1 step before, gives us the slow to be exactly one node before the nth node 
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next # moved the next to be next of next and thus elimating the nth node 

        return dummy.next # retuning the head of the given linked list 