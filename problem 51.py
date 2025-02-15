#  https://leetcode.com/problems/linked-list-cycle-ii/

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach

# when slow moves by 1 and fast moves by 2 step they are bound to meet at one point if there is a cycle
# once they meet then one of the pointers is reset to head and move the pointers one step at a time
# then they meet at cycle starting point.


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        flag = False
        if head == None or head.next == None:
            return None

        slow = head
        fast = head

        while fast != None and fast.next!= None:
            slow = slow.next
            fast = fast.next.next
            if (slow == fast): 
                flag = True
                break
                
        if not flag: # if no cycle
            return None

        fast = head

        while(slow != fast):
            fast = fast.next
            slow = slow.next
        return slow