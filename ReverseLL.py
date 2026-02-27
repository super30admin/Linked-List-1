# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        """
        Recursive Soltion : 
        TC : O(n)
        SC : O(n)
        def helper(head):
            if not head.next:
                return head
            
            re = helper(head.next)
            head.next.next = head
            head.next = None
            return re
        return helper(head)
        """

        #we can just have three pointers. prev, curr and temp to have
        #store the reference of the next pointer.
        prev = None
        curr = head

        while curr != None:
            # Store the next node is temp as we are modifying 
            # curr.next
            temp = curr.next
            # Modify curr.next to prev Node. This is basically where we
            # start reversing our linked list.
            curr.next = prev

            #Reversal is done. Move all the pointers one step ahead.
            prev = curr
            curr = temp
        #when then is no node to be processed, curr will be None. Prev will be one step back, return that
        return prev

    #TC : O(n)
    #SC : O(1)