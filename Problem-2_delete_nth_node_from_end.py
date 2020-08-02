# APPROACH 1: TWO PASS 
# Time Complexity : O(n), n: lengthof the linked list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None (be careful about the limits, need to reach only the previous node of the deleted node to set pointers appropriately)
#
#
# Your code here along with comments explaining your approach
# 1. Get the length of the linked list (traverse the whole list)
# 2. If node to be deleted is 1st -> return head's next
# 3. Else traverse till the previous node of the deleted node and set it's next accordingly

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        if head is None:
            return head
        
        length, curr_node = 0, head
        while curr_node is not None:
            curr_node = curr_node.next
            length += 1
         
        if length - n == 0:
            return head.next
        
        else:
            count, curr_node = 0, head
            while count < length - n - 1:
                curr_node = curr_node.next
                count += 1
               
            curr_node.next = curr_node.next.next
            
            return head

# APPROACH  ONE PASS
# Time Complexity : O(n), n: length of the linked list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Have a fast pointer move to the linked list such that it reached the nth node
# 2. Then move slow and fast at same pace till fast reaches the end, which means slow points to the node to be deleted (reach it's previous to set pointers accordingly).
# 3. Have a dummy node at the begining to handle the case where 1st node is to be deleted

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        if head is None:
            return None
        
        dummyNode = ListNode(0)
        slow, fast, count = dummyNode, dummyNode, 0
        dummyNode.next = head
        
        while count < n:
            fast = fast.next
            count += 1
            
        while fast.next is not None:
            slow = slow.next
            fast = fast.next
            
        slow.next = slow.next.next
        
        return dummyNode.next
            
        
        
