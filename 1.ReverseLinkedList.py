# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
	
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if head == None:
            return

        slow = None
        curr = head
        fast = curr.next

        while fast != None:
            curr.next = slow
            slow = curr

            curr = fast
            fast = fast.next
        
        # end of while loop
        curr.next = slow

        # update the ptrs
        head = curr
        curr = None
        slow = None

        return head
        