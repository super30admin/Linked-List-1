#Time Complexity :o(n)
#Space Complexity :o(1)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this :no
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        #Iterative Solution
#         prev=None
        
#         while(head!=None):
#             temp=head.next
#             head.next=prev
#             prev=head
#             head=temp
        
#         return prev
        
        #Recursive Solution
        if(head==None or head.next==None):
            return head
        strt=self.reverseList(head.next)
        head.next.next=head
        head.next=None
        return strt
        
        
        
        