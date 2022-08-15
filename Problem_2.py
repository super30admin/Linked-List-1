"""
Time Complexity : Inside functions
Space Complexity : Inside functions
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this : Yes


Your code here along with comments explaining your approach

Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
"""

# Approach - 1
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
        
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        """
        Time Complexity: O(K), where k is the length of the list
        Space Complexity: O(1)
        Two pass algorithm: first finding the length(K) of the list, second iterating again till the (K-n)
        """
        # creating a ListNode before head node for iterating through list and handling the edge cases
        temp = ListNode(0)
        
        temp.next = head
        _size = 0
        # node to iterate over list
        curr = head
        # calculating the length of the list
        while curr is not None:
            _size += 1
            curr = curr.next
         # Finding the node at the given position from the end   
        _size = _size - n
        # moving curr back to start of the list
        curr = temp
        # iterating till the given position
        while _size > 0:
            _size -= 1
            curr = curr.next
            
        # taking the node to be deleted in another node 
        new_node = curr.next 
        # moving the pointer of the prev node to the next node of the node to be deleted
        curr.next = curr.next.next
        # deleting the node
        del new_node
        
        return temp.next

# Approach - 2
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
        
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        """
        Time Complexity: O(K), where k is the length of the list
        Space Complexity: O(1)
        one pass approach, taking two pointers fast and slow
        """
        # creating a ListNode before head node for iterating through list and handling the edge cases
        temp = ListNode(0)
        
        # linking the temp node with the head node
        temp.next = head
        count = 1
        # two pointers for iterating over the list such that difference between fast and slow is n
        slow = temp
        fast = temp
        
        # iterating till the given position
        while fast and count <= (n + 1):
            fast = fast.next
            count += 1
            
        # moving fast till the end
        while fast:
            fast = fast.next
            slow = slow.next
            
        # once we reach till the given position value
        new_node = slow.next
        slow.next = slow.next.next
        del new_node
        
        return temp.next
       
                
                
        
        
        
            
            
        
        
            

        
                
                
                
        
        
        
            
            
        
        
            

        
    