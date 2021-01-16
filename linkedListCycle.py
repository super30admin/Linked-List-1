# Approach: Move fast by two positions and slow by one as long as fast does not reach Null pointer
# If these pointers meet, the cycle exists
    # in that case, we reset and one pointer to head and move both pointers by 1
    # return the pointer

# time: O(N)
# space: O(1)


class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:

        #base checks
        if head == None:
            return None

        flag = False
        slow = head
        fast = head

        while fast != None and fast.next != None:

            fast = fast.next.next
            slow = slow.next

            if slow == fast:
                flag = True
                break

        if flag:

            slow = head
            while slow != fast:

                slow = slow.next
                fast = fast.next

            return slow
        else:
            return None