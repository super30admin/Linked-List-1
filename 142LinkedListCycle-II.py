# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head: return 
        slow, fast = head, head
        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next
            if fast == slow: 
                break
            
        if not fast.next or not fast.next.next: return
        
        slowSecond = head
        while slow.next:
            if slow == slowSecond: 
                return slow
            slow = slow.next
            slowSecond = slowSecond.next
        return
    
    
# T.C=>O(n) Since we traverse the whole linkedList
# S.C=>O(1)
# Approach=>The fast pointer moves double fast then the slow pointer.
# If the fast and the slow pointer meet then its a cycle. Else its not a cycle.
# Just to check ones if cycle is not present we can do the extra while loop or pass and just verify on that.