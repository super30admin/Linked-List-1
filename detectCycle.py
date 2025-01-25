# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        st = set()  
        
        currNode = head  
        
        # Traverse the linked list
        while currNode is not None:
        
            # If the current node is already in the HashSet,
            # then this is the starting node of the loop
            if currNode in st:
                return currNode
            
            # If not, add the currednt node to the HashSet
            st.add(currNode)
            
            # Move to the next node
            currNode = currNode.next
        
        # If no loop found, return None
        return None
