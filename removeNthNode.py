'''
time complexity: O(n)
space complexity: O(1)
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        count=0
        dumy = ListNode(-1)
        dumy.next=head
        p1 = head
        while count<n and p1!=None:
            p1=p1.next
            count+=1
        
        p2 = dumy
        
        while p1!=None:
            p1=p1.next
            p2=p2.next
            
        
        p2.next = p2.next.next
        
        return dumy.next
            
        