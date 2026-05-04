# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        length = 0 
        curr = head
        prev = head

        # Get the length of the linkedlist
        while curr:
            curr = curr.next
            length = length + 1
        
        # Get the position of the node to be deleted
        del_index = (length - n)

        # for cases with difference 0, removing the head.
        if del_index == 0:
            return head.next        

        prev = head
        
        while del_index > 1:
            prev = prev.next
            del_index -= 1
        
        curr = prev.next

        # Swaping the links to delete targetnode
        temp = curr.next
        curr.next = None
        prev.next = temp

        return head

# Time complexity: O(2N) = O(N)
# Space complexity: O(1)


