# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        if(head == None):
            return head
        
        dummyNode = ListNode(-1, head)
        current = dummyNode
        nthNode = dummyNode
        
        for x in range(0, n):
            nthNode = nthNode.next
        
        while(nthNode.next != None):
            current = current.next
            nthNode = nthNode.next
            
        current.next = current.next.next
        
        return dummyNode.next
