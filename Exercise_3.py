# Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
# // Time Complexity :O(2n) = O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :No


# // Your code here along with comments explaining your approach
def detectCycle(head):
    # 2 ptrs slow and fast
    slow = head
    fast = head
    # flag for ifcycle
    has_cycle = False
    # iterating through the LL till fast.next is not None
    while (fast is not None and fast.next is not None):
        # slow in 1x speed fast in 2x speed
        slow = slow.next
        fast = fast.next.next
        # if coincide --> cycle
        if (slow == fast):
            has_cycle = True
            break
    if has_cycle:
        # distance from head to start of cycle == distance from meeting point to start of cycle
        fast = head
        # iterating till coincide again
        while (slow != fast):
            slow = slow.next
            fast = fast.next
        return fast
    return None
