# reverse a linked list

# // Time Complexity :  O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

## Using 3 pointers prev - curent - fast(next)
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None: return head
        prev = None
        cur = head
        fast = head.next

        while(fast != None): # O(n)
            cur.next = prev
            prev = cur
            cur = fast
            fast = fast.next
        cur.next = prev
        return cur