# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Time Complexity => O(N)
# Space Complexity => O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        count = 0
        p1 = head
        p2 = head
        if(head.next == None):
            return None
        while(count != n and p2.next!=None):
            p2 = p2.next
            count+=1
        if(count!=n):
            head = head.next
            return head
        while(p2.next!=None):
            p1 = p1.next
            p2 = p2.next
        p1.next = p1.next.next
        return head
            
            
            
            
            