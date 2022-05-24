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
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
    
        if head is None:
            return None
        
        temp = ListNode(-1)
        temp.next = head
        fast = temp
        count = 0
        
        while count <= n:
            fast = fast.next
            count += 1
        slow = temp
        while fast != None:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return temp.next
        