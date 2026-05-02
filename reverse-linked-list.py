# O(n) time, O(1) space
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        cur = head
        while cur:
            temp = cur.next 
            cur.next = prev 
            prev = cur 
            cur = temp 
        return prev 



# reverse linked list with recursion - O(n) time, O(1) space
# recursion stack:
# f(none)
# f(5)
# f(4)
# f(3)
# f(2)
# f(1)
class Solution:
    def reverseList(self,head):
        if head is None or head.next is None:
            return head 

        # result is in global, not a parameter of recursion
        result = self.reverseList(head.next) # return to returns to the same place from where we called it
        # 5 5 5 5 5
        head.next.next = head 
        head.next = None 
        return result 