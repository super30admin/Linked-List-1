# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    """Time complexity-O(n)
        Space Complexity-O(1)"""
    def detectCycle(self, head: ListNode) -> ListNode:
        slow=head
        fast=head
        flag=False
        while fast and fast.next:
            slow=slow.next
            fast=fast.next.next
            if slow==fast:
                flag=True
                break
        fast=head
        if not flag:
            return None
        while fast!=slow:
            fast=fast.next
            slow=slow.next
        return slow
            
        
        
        """Time complexity-O(n)
        Space Complexity-O(n)"""
        # map=set()
        # ll=head
        # i=0
        # while ll:
        #     if ll not in map:
        #         map.add(ll)
        #         ll=ll.next
        #         i+=1
        #     else:
        #         return ll 

            
        