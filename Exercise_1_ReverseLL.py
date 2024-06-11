# Time Complexity :
# O(N)

# Space Complexity :  
# O(1)  



# Approach:
# Use three pointers, prev, curr and nextNode.
# Initially, "prev" is set to None, "curr" to head and "nextNode" to 2nd node in LL.
# 1. For each set of prev, curr and nextNode, we reverese the links between the nodes, 
# 2. Advance threee pointers to their next node
# 3. Loop until nextNode points to NULL
# 4. Finally reverese the link of the element pointed by "curr" to "prev

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return 

        prev = None
        curr = head
        nextNode = curr.next

        # iterate untill nextNode is Null/None
        while(nextNode):
            curr.next = prev
            prev = curr
            curr = nextNode
            nextNode = nextNode.next

        # reverse the link for the last element, pointed to by "curr"
        curr.next = prev
        return curr