# Brut force
# Time : O(2n)
# Space : O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head == None: return head
        length = 0
        curr = head
        while curr != None:
            length += 1
            curr = curr.next
        
        i = 0
        prev = ListNode(-1, head)
        curr = head
        while i < length-n:
            prev = curr
            curr = curr.next
            i += 1
        
        if prev.next != None:
            temp = prev.next
            prev.next = prev.next.next
            temp.next = None
        if prev.val == -1:
            return prev.next

        return head

        
# Time : O(n)
# Space: O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head == None: return head
        count = 1
        # slow = ListNode(-1, head)
        dummy = ListNode(-1, head)

        # Get the nth node from start
        fast = head
        slow = dummy
        while count <= n:
            fast = fast.next
            count += 1
        # Find prev elem of the nth ele that needs to be deleted
        while fast != None:
            slow = slow.next
            fast = fast.next
        # remove link between slow and next
        temp = slow.next
        slow.next = slow.next.next
        temp.next = None

        # if slow.val == -1:
        #     return slow.next
        return dummy.next
    


        