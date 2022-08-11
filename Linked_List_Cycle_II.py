# Time complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        ##### WATCH CLASS VIDEO FOR EXPLANATION OF WHY a = c #########
        ######## The distance from head to the point where fast and slow meet is the same as the distance from that point to the starting point of the cycle ############
        ###### Let a = distance from head to point of start of cycle; 
        ######     b = distance from start of cycle to curr node where slow and fast meet; 
        ######     c = distance from the slow and fast ptrs intersection point to start of the cycle
        ###### At the intersection point slow distance = a+b ; fast distance = a + b + b + c
        ###### Slow is half the distance of fast, so 2*(a+b) = a+b+b+c i.e 2a + 2b = a +2b +c i.e a = c
        
        if not head:
            return None
        
        slow = head
        fast = head
        
        flag = False
        
        while(fast and fast.next):
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                flag = True
                break
        if flag == False:
            return None
        
        slow = head
        
        while(slow != fast):
            slow = slow.next
            fast = fast.next
            
        return slow
            