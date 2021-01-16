# Approach: Use 3 pointers to reverse list iteratively

# Time - O(N)
# Space: O(1)
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:

        if head == None or head.next == None:
            return head

        prev = None
        current = head
        fast = current.next

        while fast != None:
            current.next = prev
            prev = current
            current = fast
            fast = fast.next

        current.next = prev
        return current


# Time: O(N)
# Space: O(N) since it uses the stack

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:

        if head == None or head.next == None:
            return head
        
        reversed = self.reverseList(head.next)
        print(head.val)
        head.next.next = head
        head.next = None
        
        return reversed
