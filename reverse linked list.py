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
        
        if(head == None):
            return head
        
        prevNode = None
        nextNode = None
        currentNode = head
        
        while(currentNode):
            nextNode = currentNode.next
            currentNode.next = prevNode
            
            prevNode = currentNode
            currentNode = nextNode
        
        head = prevNode
        return head
