# // Time Complexity : o(n) 
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : intuition behind the logic where slow and fast will meet again after meeting


# // Your code here along with comments explaining your approach
# idea is to first find if cycle exists if it does then find the node at which it occurs . This can be done by two pointers or hashmap
# initialize the slow pointer and fast - move slow 1x fast 2x find the spot where they meet 
# reinitialize slow to head and move slow and fast at 1x till they meet the discance they will travel will be the same

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

from typing import Optional, List
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow , fast, flag = head, head, False
        # find if cycle using slow and fast
        while  fast and  fast.next:
                slow=slow.next 
                fast=fast.next.next
                if slow == fast:
                    flag = True
                    break
        if not flag : return None
        #  once met they will travel same distance 2a+2b = a+b+c+b i.e a = c
        slow = head
        while slow!= fast:
            slow= slow.next
            fast = fast.next
            
        return  fast


        


        