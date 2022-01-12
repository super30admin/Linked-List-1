# Time Complexity : O(n) where n is the number of nodes.
# Space Complexity : O(1).
# Did this code successfully run on Leetcode : Yes.
# Any problem you faced while coding this : No.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return None
        fast  = head.next.next
        slow = head.next
        while(fast!= slow):
            if fast == None or fast.next == None:
                return None
            fast = fast.next.next
            slow = slow.next
        fast = head
        while(fast!=slow):
            fast = fast.next
            slow = slow.next
        return fast
#          Class Solution   
#         if head == None or head.next == None:
#             return None
#         fast = head
#         slow = head
#         flag = False
#         while(fast != None and fast.next != None):
            
#             fast = fast.next.next
#             slow = slow.next
#             if fast == slow:
#                 flag = True
#                 break
#         if flag == False:
#             return None
#         fast = head
#         while(fast!=slow):
#             fast = fast.next
#             slow = slow.next
#         return fast
