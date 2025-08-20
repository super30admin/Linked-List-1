# Time Complexity : It is O(n) since we are iterating with all nodes.
# Space Complexity : It is O(n) considering all the leaves of the nodes can be in the queue.
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if(head ==None or head.next ==None):
            return None
        preNode = ListNode()
        slowNode = head
        fastNode = head
 
        for i in range(n):
            fastNode=fastNode.next

        while(fastNode != None):
            preNode =slowNode
            slowNode = slowNode.next
            fastNode = fastNode.next
        
        preNode.next=slowNode.next

        if(head==slowNode):
            head=preNode.next
                    
        return head



    

        