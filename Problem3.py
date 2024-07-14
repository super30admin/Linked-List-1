#First, I use two pointers, 'slow' and 'fast', moving at different speeds to detect if there's a cycle. If there's no cycle, the function returns None. If a cycle is detected, I then find the length of the cycle by moving a 'tracer' pointer around the cycle once, counting the steps. Next, I move another pointer 'tracer' ahead by the cycle length from the head of the list. Finally, I move both 'temp' (starting from the head) and 'tracer' at the same speed until they meet, which will be at the start of the cycle.


class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head.next.next if head and head.next else None
        while slow != fast:
            slow = slow.next
            fast = fast.next.next if fast and fast.next else None
        if not slow:
            return slow
        tracer = slow.next
        count = 1
        while tracer != slow:
            count +=1
            tracer= tracer.next
        tracer = head
        while count > 0:
            tracer = tracer.next
            count -=1
        temp  = head
        while temp != tracer:
            temp = temp.next
            tracer = tracer.next
        return temp