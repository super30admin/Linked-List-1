# APPROACH 1: ITERATIVE APPROACH
# Time Complexity : O(n), n: length of the linked list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Have a pointer pointing to previous, current and 
# 2. In each iteration, current element's next points to previous element
# 3. Update previous -> current, current -> next and next -> next's next

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        if head is None or head.next is None:
            return head
        
        prev, curr, curr_next = None, head, head.next
        
        while curr_next is not None:
            curr.next = prev
            prev = curr
            curr = curr_next
            curr_next = curr_next.next
            
        curr.next = prev
        
        return curr
        
        
        
        
        
        

# APPROACH 2: RECURSIVE APPROACH
# Time Complexity : O(n), n: length of the linked list
# Space Complexity : O(n), due to the size of the recursive stack
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Traverse till the end of the list
# 2. From back onwards, each node's next element's next will point to the node and make each node's next point to None (either will get updated in next recursive call or last 
#    element points to None
# 3. Make sure you keep passing the startnode (original list's last node), so that we can access the list

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        if head is None or head.next is None:
            return head
        
        start_node = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        
        return start_node
