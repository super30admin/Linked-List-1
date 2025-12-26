# Time: O(n)
# Space: O(n)

# Que => Check if there is a cycle in the linked list 

# Have a set that consists of nodes and not values because values can be repeating but nodes can't repeat
# while looping through the linked list check if the node is already present in the set if yes then there is a cycle on that node
# if not then add that node to the set

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        s = set()
        curr = head

        while curr != None:
            if curr in s:
                return curr
            else:
                s.add(curr)
            curr = curr.next


# Time: O(n)
# Space: O(1)

# Have two pointers slow(1x speed) and fast(2x speed)
# In the first pass if they meet there is a circle and if they not then there is no circle
# Then move one of the pointer back to the head and move both the pointers at 1x speed
# wherever these two pointers meet is the node where there is a circle
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        flag = False

        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break

        if not flag:
            return None
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow