
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

"""
We keep a fast and a slow pointer to remove the nth node from the end. The slow will not start moving till fast reaches n nodes ahead from the head.
After that both Slow and fast will move one step at a time and when Fast will be at the end, the null will be at the n-1 th position

TC = O(n)
SC = O(n)
"""
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head is None:
            return head
        dummy= ListNode()
        dummy.next = head
        slow = dummy
        fast = dummy
        temp = 0
        while temp<=n:
            fast = fast.next
            temp+=1
        while fast!=None:
            fast = fast.next
            slow = slow.next
            
        slow.next = slow.next.next
        
        return dummy.next

