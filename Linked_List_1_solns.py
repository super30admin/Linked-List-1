# https://leetcode.com/problems/reverse-linked-list/
# Time Complexity : O(n) | n is length of the linked list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None: return head
        reversed = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        
        return reversed
        

# https://leetcode.com/problems/remove-nth-node-from-end-of-list/
# Time Complexity : O(n) | n is length of the linked list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1, head)
        count = 0
        fast = dummy
        while count <= n:
            fast = fast.next
            count += 1
            
        slow = dummy
        
        while fast:
            fast = fast.next
            slow = slow.next
            
        slow.next = slow.next.next
        
        return dummy.next
                       
# https://leetcode.com/problems/linked-list-cycle-ii/
# Time Complexity : O(n) | n is length of the linked list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        flag = False
        slow, fast = head, head
        if not head or not head.next: return head
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                flag = True
                break
            
        slow = head
        
        while slow != fast:
            slow = slow.next
            fast = fast.next
            
        return slow
            