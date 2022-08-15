"""
Time Complexity : Inside functions
Space Complexity : Inside functions
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this : Yes


Your code here along with comments explaining your approach

Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

"""
# Approach - 1

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        using hash set to store the node. If the node present in the set then it represents the loop.
        Time Complexity : O(n)
        Space Complexity: O(n)
        """
        if head==None : return None
        # creating a set to store the visited node 
        visited_node = set()
        
        curr = head
        while curr is not None:
            if curr in visited_node:
                return curr
            else:
                visited_node.add(curr)
                curr = curr.next
                
        return None


# Approach - 2
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Using fast and slow runner approach
        Time Complexity: O(n)
        Space Complexity: O(1)
        """
        if head==None : return None
      
        slow = head
        fast = head
        # for detecting a loop
        flag = False
        
        # we are checking fast and fast.next bcoz we need to cover both odd and even lengths of linked list
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if fast == slow:
                flag = True
                break
        
        # Moving slow pointer back to head-first node
        slow = head
        
        if not flag: return False
        
        while slow != fast:
            slow = slow.next
            fast = fast.next
        
        
        return slow

        
        
                
        
        
        
                


                
        
        
        