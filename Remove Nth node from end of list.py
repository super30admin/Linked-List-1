# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        #Approach: Iterative
        #Time Complexity: O(n)  #one-pass
        #Space Complexity: O(1)
        
        slow_pointer = None
        fast_pointer = head
        
        count = 0
        while fast_pointer:
            fast_pointer = fast_pointer.next
            count += 1
            
            if count == n + 1:
                slow_pointer = head
            if count > n + 1:
                slow_pointer = slow_pointer.next
        
        if slow_pointer:
            slow_pointer.next = slow_pointer.next.next
        else:
            head = head.next
        
        return head