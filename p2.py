class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        nodes = []
        current_node = head
        
        while current_node:
            nodes.append(current_node)
            current_node = current_node.next
        
        if len(nodes) == n:
            return head.next
        elif n == 1:
            nodes[-2].next = None
        else:
            nodes[-n - 1].next = nodes[-n + 1]
            
		return head