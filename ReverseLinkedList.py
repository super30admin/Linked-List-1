# Time Complexity : It is O(n) since we are iterating with all nodes.
# Space Complexity : It is O(1) no extra space we are using.
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        PreDummyNode = ListNode()
        PreDummyNode = None
        currNode= head
  
        while(currNode != None):     

            fastNode =currNode.next  
            currNode.next=PreDummyNode 
            PreDummyNode=currNode
            currNode=fastNode    
                     
        return PreDummyNode  
