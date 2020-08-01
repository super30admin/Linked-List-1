# APPROACH 1: HASHSET 
# Time Complexity : O(n), n: length of the linked list
# Space Complexity : O(n), due to hashset (what if all elements are unique, when there's no cycle)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Go through each node of the linked list
# 2. Check if the node exists in hashset -> If so, there's a cycle as we had visisted this node before and return this node (start of the cycle)
# 3. Else, add to the hashset if we have not seen before

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        
        hashset, curr_node = set(), head
        
        while curr_node is not None:
            
            if curr_node in hashset:
                return curr_node
            else:
                hashset.add(curr_node)
                curr_node = curr_node.next
                
        return None
            
        
        
        

# APPROACH 2:  SLOW AND FAST POINTERS
# Time Complexity : O(n), n: length of the linked list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Have slow and fast pointers moving at 1x and 2x speeds respectively
# 2. If there's no cycle -> fast or fast's next becomes None
# 3. If there's cycle -> slow will become equal to fast
# 4. to get start of the cycle, move start to the begining and move both fast and slow at same 1x speed. the point at which they meet is the start. 2(a + b) = a + b + + c + b

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        
        if head is None or head.next is None:
            return None
        
        slow, fast, isFirst, isCycle = head, head, True, False
        
        while (fast is not None and fast.next is not None) or isFirst:
            
            if slow == fast and isFirst is False:
                isCycle = True
                break
                
            isFirst = False
            
            slow = slow.next
            fast = fast.next.next
            
        if isCycle is False:
            return None
            
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
            
        return slow
            
        
        
        
