# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :no

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# class Solution:
#     def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
class ListNode:
    def __init__(self,val,next=None):
        self.val=0
        self.next=next
class Solution:
    def reverseList(self,head:Optional[ListNode])-> Optional[ListNode]:
        if not head or not head.next:
            return head
        reverseded=self.reverseList(head.next)
        head.next.next=head
        head.next=None 
        return reverseded