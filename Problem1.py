# Reverse Linked List
# Time complexity On
# SPace complexity -> O1
# Logic -> Maintain prev and curr pointer, eveery loop update next of curre to prev, and move both 1 step ahead while maintaing
# the pointer to the next element of the current node using tmp
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head

        while curr !=None:
            tmp = curr.next
            curr.next = prev
            prev = curr
            curr = tmp
        return prev