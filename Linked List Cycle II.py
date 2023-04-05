# Time Complexity :  O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        slow = fast = head
        flag = False

        while(fast != None and fast.next != None ):
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
        
        if not flag:
            return None

        # a + b = a + 2b + c
        #since slow was moving at half the speed, in order to match the distance covered by fast:
        # 2(a+b) = a + 2b + c -> a = c
        slow = head
        while(slow != fast):
            slow = slow.next
            fast = fast.next

        return slow