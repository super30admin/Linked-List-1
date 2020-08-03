"""
Problem:
https://leetcode.com/problems/linked-list-cycle-ii/

Approach:

1. take 2 pinters fast and slow both pointing to head
2. untill fast!=None and fast.next!None, move fast pointer in 2x speed and slwo pointer in 1x speed
3. break when fast==slow and set the flat=1 indicating the presence of the cycle-ii/
4. if cycle is present then point the slow pointer to the head and move both fast and slow pointer in 1x speed untill the meet,
the place where they meet will be the start of the cycle

"""

# Time Complexity : O(n) 
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = head
        fast = head
        flag = 0
        
        while (fast!=None and fast.next!=None):
            slow = slow.next
            fast = fast.next.next
            if(slow == fast):
                flag=1
                break
        
        if (flag):
            slow = head
            while(slow!=fast):
                slow= slow.next
                fast = fast.next
            return slow      
        else:
            return None