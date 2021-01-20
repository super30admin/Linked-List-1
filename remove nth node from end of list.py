# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        #Approach: Two pointers
        
        dummy = ListNode(-1, head)
        slow_pointer = dummy
        fast_pointer = dummy
        
        count = 0
        while fast_pointer:
            if count <= n:
                fast_pointer = fast_pointer.next
                count += 1
            else:
                fast_pointer = fast_pointer.next
                slow_pointer = slow_pointer.next
        
        slow_pointer.next = slow_pointer.next.next
        
        return dummy.next
        
		
#Time Complexity: O(n)
#Space Complexity: O(1)