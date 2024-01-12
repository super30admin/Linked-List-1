#problem: Reverse Linked List
# time complexity: O(n)
# space complexity: O(1)
# Approach: Iterative approach to reverse the linked list by using three pointers prev, curr and temp.
#logic behind the approach:
# 1. We will take three pointers prev, curr and temp.
# 2. We will iterate through the linked list till the curr is not null.
# 3. We will store the next node of curr in temp.
# 4. We will point the next node of curr to prev.
# 5. We will point the prev to curr.
# 6. We will point the curr to temp.
# 7. We will return the prev as it will be the head of the reversed linked list.
# -- keeping it descriptive for better understanding.
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev, curr = None, head

        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        return prev