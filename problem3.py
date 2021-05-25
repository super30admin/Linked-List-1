class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = head
        fast = head
        flag = True
        while(fast!=None and fast.next!=None):
            slow = slow.next
            fast = fast.next.next
            if (slow==fast):
                flag = False
                break
        if (flag == True):
            return None
        fast = head
        while(slow != fast):
            slow = slow.next
            fast = fast.next
        return slow
