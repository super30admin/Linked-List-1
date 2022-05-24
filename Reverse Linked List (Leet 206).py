'''
Time Complexity: O(N), where N is the lentgh of the linked list
Space Complexlity: O(1)
Successfully Executed: Yes
Challenges Faced: No
'''

#CODE

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None
        
        prev = None
        curr = head
        fast = curr.next
        
        while fast != None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        curr.next = prev
        
        return curr

#Recursive Approach
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        
        reve = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return reve