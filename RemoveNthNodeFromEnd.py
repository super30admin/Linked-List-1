# Time Complexity : 
# Space Complexity :
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :


# Your code here along with comments explaining your approach
'''There are two edge cases to handle here.
In any LinkedList problem it is a good idea to start by handling the edge cases of 
1. head is None 
2. head.next is None

The third edge case is that
3. n == number of nodes in the linked list. (However, in this problem 2 and 3 are the same. Observe.)

When case 3 is true in a test case the fast pointer reaches None at the end of the linkedlist.
We have to update head and return head.

In other cases we can use the slow pointer to remove the node.
'''


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        if not head or (not head.next and n == 1):
            return None
        
        if not head.next and n == 0:
            return head
        
        slow = head
        fast = head
        
        counter = 0
        while fast and counter < n:
            fast = fast.next
            counter += 1
        
        if not fast:
            head = head.next
            return head
        
        while fast.next:
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next
        
        return head