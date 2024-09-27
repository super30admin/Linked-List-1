#Time Complexity:O(n)
#Space Complexity:O(1)
#leetcode submission:succesful
#we keep a temp Listnode and store current value while we change the pointers of the current ListNode
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        prev=None
        while head:
            temp=head
            head=head.next
            
            temp.next=prev
            prev=temp
        return prev