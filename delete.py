# // Time Complexity :O(n) 
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach





# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy=ListNode()
        dummy.next=head
        first=dummy
        last=dummy
        count=0
        while count<=n:
            count=count+1
            last=last.next
        while last:
            first=first.next
            last=last.next
        first.next=first.next.next
        return dummy.next
        
        