#Time Complexity O(N) One pass for traversing Linklist
#Space Complexity O(1)
#It successfully runs on the leetcode

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        curr = head
        prev = None
        
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr= temp
            
        return prev

    #recursive solution with TC: O(N), SC: height of call stack (recursive depth)
    def reverseListrec(self,head,prev=None):
        if not head:
            return prev
        temp = head.next
        head.next = prev
        return self.reverseListrec(temp,head)