# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes

# Your code here along with comments explaining your approach

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                break
        if fast == None or fast.next == None:
            return None
        
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow
        