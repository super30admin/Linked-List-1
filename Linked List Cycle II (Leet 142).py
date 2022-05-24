'''
LOGIC: Using Floyd's Algorithm
Time Complexity: O(N), where N is the lentgh of the linked list
Space Complexlity: O(1)
Successfully Executed: Yes
Challenges Faced: No
'''

#CODE

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if head is None:
            return None
        
        slow, fast = head, head
        found = False
        
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                found = True
                break
        
        if found is False:
            return None
        
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        
        return slow