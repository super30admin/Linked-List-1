#Problem 19. REMOVE NTH NODE FROM END OF LIST
# TIME COMPELXITY: O(N) where N denotes the number of nodes present
# SPACE COMPLEXITY: O(1) as we are using pointers 


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: Optional[ListNode]
        :type n: int
        :rtype: Optional[ListNode]
        """
        dummy=ListNode(-1)
        dummy.next=head
        counter=0
        fast=dummy
        slow=dummy

        while counter<=n:
            fast=fast.next
            counter+=1

        while fast is not None:
            slow=slow.next
            fast=fast.next

        # temp = slow.next
        # slow.next = slow.next.next
        # temp.next = None

        slow.next = slow.next.next

        return dummy.next
