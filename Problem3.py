#time complexity:0(n)
#space complexity :0(1)

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        
        slow = head
        fast = head 
        flag = False
        
        while fast and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
                
        if flag == False:
            return None
        
        fast = head
        
        while slow!=fast:
            slow = slow.next
            fast = fast.next
        return fast
        """
        :type head: ListNode
        :rtype: ListNode
        """
        