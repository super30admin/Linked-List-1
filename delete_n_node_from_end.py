# Time Complexity : Add - O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes.

# Any problem you faced while coding this : No

'''
1. fast is moved upto n location 
2. Then both slow and fast is moved untill fast == None
3. Now slow.next = slow.next.next is performed which forms a skip connection over the node to be deleted
'''

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        
        
        dummy = ListNode()
        dummy.next = head
        slow = dummy
        fast = dummy
        
        count = 0
        while count <= n:        
            fast = fast.next
            count += 1
            
        
        while fast:
            
            fast = fast.next
            slow = slow.next
                
        slow.next = slow.next.next
        
        return dummy.next
            