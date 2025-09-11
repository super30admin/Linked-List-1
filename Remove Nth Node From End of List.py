# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

'''
Slow and Fast pointers. We create a window of 'n' between slow and fast.
Then, start iterating both slow and fast until fast reaches end of list.
Slow will stop at one step back from the node to be removed. Then remove 
slow's next node. 
We add a Dummy node at the head. This will take care in cases where we need to remove
the first node of the list. eg. [1,2,3] | n = 3  -> [2,3]  
Time complexity: O(N) - Fast iterates over the entire list
Space Complexity: O(1) - No auxilary space
'''

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy_node = ListNode(-1) 
        dummy_node.next = head # point dummy node at head

        slow = dummy_node
        fast = dummy_node

        # Take Fast ahead by 'n', in order to get a gap of n between slow and fast
        count = 0 
        while count<=n:
            fast = fast.next
            count+=1
        
        # traverse both slow and fast until fast reaches end
        while fast!=None:
            fast = fast.next
            slow = slow.next
        
        # Remove the Nth node. slow is one step behind
        temp = slow.next # Node to be removed
        slow.next = slow.next.next 
        temp.next = None # remove the link of removed node from list

        # return the head (maybe 1st head was removed)
        return dummy_node.next