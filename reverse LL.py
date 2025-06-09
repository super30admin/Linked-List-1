#Time Complexity: O(N)
#Space Complexity: O(1)

class Solution(object):
    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        prev = None  
        current = head  
        
        while current is not None:
            next_node = current.next  
            current.next = prev  
            prev = current 
            current = next_node  

        return prev 

        