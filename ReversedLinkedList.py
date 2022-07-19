# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Time Complexity => O(N)
# Space Complexity => O(1)
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if(head == None):
            return None
        temp = head
        before = None
        while(temp is not None):
            after = temp.next
            temp.next = before
            before = temp
            temp = after
        head = before
        return before
        