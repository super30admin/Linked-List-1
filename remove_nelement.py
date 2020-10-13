// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        count = 1
        prev, cur, ptr = None, None, head
        while(ptr):
            if count == n:
                cur = head
            elif count > n:
                prev = cur
                cur = cur.next
                
            ptr = ptr.next
            count += 1
            
        if cur is None:
            return head
        if prev is None:
            return head.next
        
        prev.next = cur.next
        return head