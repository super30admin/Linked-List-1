'''
1. Create a dummy node and point it's next to head as to handle a case of head getting deleted
2. Maintain 2 pointers - slow and fast pointing to dummy. Move fast pointer n steps ahead. Then move both pointers till fast is not None. 
3. Now slow is at one before the node to be deleted. Modify the link of slow.next to point to slow.next.next deleting the node. Return dummy.next as it is the new head

TC: O(n)
SC: O(1)
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        if head == None:
            return head

        dummy = ListNode(-1)
        dummy.next = head

        slow = dummy
        fast = dummy
        count = 0

        while count <= n:
            fast = fast.next
            count+=1

        while fast!=None:
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next
        
        return dummy.next


        

        
