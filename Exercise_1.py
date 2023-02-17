#Time Complexity : O(N), N being the number of values in list. 
#Space Complexity : O(1), no additional array is used.
#Did this code successfully run on Leetcode : Yes.
#Any problem you faced while coding this : Did not add the last link in the end
#at first. Result was just the last value. Fixed in debugging. 
#Your code here along with comments explaining your approach in three sentences only
'''Starting from the beginning of the linked list, traverse and reverse the link. 
Return the last node. 
'''
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #handle if head is None. 
        if head==None:
            return head
        #initialize variables.     
        prev = None
        next_node = head.next
        curr = head
        #traverse and reverse link by keeping a next_node while curr.next is prev. 
        while(next_node!=None):
            curr.next = prev

            temp = next_node
            next_node = next_node.next
            prev = curr
            curr = temp
        curr.next = prev
        #return curr. 
        return curr