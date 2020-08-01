# Time complexity: O(n)
# Space complexity: O(1)
# Worked on leetcode: yes
# This algorithm uses 2 pointers approach. A slow pointer moves at a 1x speed, and a fast pointer moves
# at a 2x speed. If there is a cycle, both pointers must coincide.
# To find the node at which cycle starts, we shift either of the pointers to the head, and then both pointers
# move with 1x speed. The node where they meet, is the node from where the cycle starts.

def linked_list_cycle(head):

    slow = head
    fast = head
    flag = True
    while (fast != None and fast.next != None):
        slow = slow.next
        fast = fast.next.next

        if slow == fast:
            flag = True
        break

    if flag == False:
        return None
    else:  # if there is a cycle
        slow = head  # reset one of the pointers
        while (slow != fast):
            slow = slow.next
            fast = fast.next

        return slow
