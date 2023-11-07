class Solution(object):
    def detectCycle(self, head):
        try:
            fast = head.next
            slow = head
            while fast is not slow:
                fast = fast.next.next
                slow = slow.next
        except:
            return None

        slow = slow.next
        while head is not slow:
            head = head.next
            slow = slow.next

        return head
        
