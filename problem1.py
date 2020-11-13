#timecomplexity O(n)
#spacecomplexity O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


class Solution:
    # recurrsion call 1->2->3->4->5-> none
    def reverseList(self, head: ListNode) -> ListNode:
        if head==None or head.next==None: return head
        
        temp=self.reverseList(head=head.next)# this will return the last node ie 5
        head.next.next=head# poping will start at 4 i.e at last recursion stack 4 is head and head.next is 5
        head.next=None
        
        return temp
        
        