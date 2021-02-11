#TimeComplexity:O(N) since we have to traverse all the values till Null 
#SpaceComplexity: O(1)
#Did this code successfully run on Leetcode : Yes 
#Any problem you faced while coding this : No
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        cur=head# we will be creating 3 listnodes one points to prev, one to cur, one to Next
        prev=None
        while cur!=None:# we are pointing each pointer in reverse direction starting from None(prev)
            Next=cur.next
            cur.next=prev
            prev=cur
            cur=Next
        return prev
        
