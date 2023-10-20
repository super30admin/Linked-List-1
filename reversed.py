# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if(head==None or head.next==None):
            return head

        curr=head
        prev=None
        while(curr.next!=None):
            temp=curr.next
            curr.next=prev
            prev=curr
            curr=temp
        curr.next=prev
        return curr
    # recursion 
        # if(head==None or head.next==None):
        #     return head
        # result = self.reverseList(head.next)
        # print(head.val)
        # head.next.next=head
        # head.next=None
        # return result