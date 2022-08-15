"""
Time Complexity : Inside functions
Space Complexity : Inside functions
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach

Problem1 (https://leetcode.com/problems/reverse-linked-list/)
"""

# Approach - 1
def reverse_list(self, head):
        """
        Reverse a linked list
        type: list
        rtype: reverse list
        Method: iteration
        Time Complexity: O(n)
        Space Complexity: O(1)
        """
        if head is None: return
        
        curr_node = head
        prev_node = None
       
        
        while curr_node is not None:
            next_node = curr_node.next
            curr_node.next = prev_node
            prev_node = curr_node
            curr_node = next_node
            
        return prev_node
        

# Approach - 2

def reverse_list_rec(self,head):
        """
        Reverse a linked list using recursion
        type: list
        rtype: reverse list
        Method: recursion
        time complexity = o(n)
        Space Complexity = O(n)
        """
        if head is None or head.next is None:
            return head
        
        node = self.reverse_list_rec(head.next)
        head.next.next = head
        head.next = None
        return node
    
 


        
        