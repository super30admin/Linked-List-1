# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        '''Time Complexity: O(n)
        Space Complexity: O(1)'''
        
        if head is None:
            return None
        
        fast=head
        slow=head
        count=0
        flag=False
        
        while fast is not None and fast.next is not None:
            #Fast ---- 2x speed
            fast=fast.next.next
            
            #Slow 1x ----------speed
            slow=slow.next
            
            if fast==slow:
                flag=True
                break
        print(flag)
        if flag:
            slow=head
            while fast!=slow:
                fast=fast.next
                slow=slow.next
            return slow

                
        return None
                
