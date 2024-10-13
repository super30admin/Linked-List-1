# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A


# Your code here along with comments explaining your approach
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if(head==None):
            return None
        #Assign prev as prevoisu of head and curr as head
        prev = None
        curr = head
        while(curr!=None):
            #Consider a temp variable pointing after curr
            temp = curr.next
            #Remove the connection of the node after curr and assign it to prev
            curr.next = prev
            #Move prev to curr
            prev=curr
            #Move curr to temp
            curr=temp
        return prev