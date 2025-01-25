# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:

    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        ## Brute force Approach ##
        # TC - O(n, SC - O)(n)
        # if head== None or head.next== None:
        #      return None
        # nodeSet = set()
        # current = head
        # while current.next!=None:
        #     if current in nodeSet:
        #         return current
        #     nodeSet.add(current)
        #     current = current.next
        # return None    
            
        
        #### Optimized Solution with ###
        #TC - O(n) and SC - O(1)
        if head== None or head.next== None:
            return None
        slow, fast = head, head
        detectedFalg = False

        while fast.next!= None and fast.next.next!=None:
            fast = fast.next.next
            slow = slow.next
            if fast ==slow:
                detectedFalg = True
                break

        if detectedFalg:
            fast = head
            while fast!=slow:
                fast = fast.next
                slow = slow.next

        return slow if detectedFalg else None                


        
