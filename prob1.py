# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]: 
        temp = head
        prev =  None
        if(temp is None):
            return temp
        while(temp.next is not None):
            after = temp.next
            temp.next = prev
            prev = temp 
            temp = after
        temp.next = prev
        head = temp
        return  head