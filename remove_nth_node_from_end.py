# Time complexity: O(n)
# Space complexity: O(1)
# Worked on leetcode: yes
# This algorithm uses 2 pointers approach. A fast pointer moves takes n steps. From there, the fast and slow
# keeps on moving till fast pointer reaches the last node. The node next to the slow pointer is the one which is to be removed.

def removeNthFromEnd(head, n):
    dummy = ListNode(0)
    slow = dummy
    fast = dummy

    dummy.next = head

    count = 0
    while (count <= n):
        fast = fast.next
        count = count + 1

    while fast != None:
        slow = slow.next
        fast = fast.next

    slow.next = slow.next.next  # fast

    return dummy.next


