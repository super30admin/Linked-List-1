# Time Complexity : O(n) where n is the number of nodes
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

# we create 2 pointers slow, fast
# we iterate through the LinkedList with slow by 1 node and fast by 2 node
# if fast is null then it is not cycle
# if fast == slow then cycle found
# To detect the cycle point, we keep the slow where it met the fast and make the head and slow move until they meet each
# other, the point they meet each other is the cycle point.



class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:

        slowP = head

        fastP = head

        while fastP is not None and fastP.next is not None:

            slowP = slowP.next

            fastP = fastP.next.next

            if fastP == slowP:

                print(fastP.val)

                while head is not slowP:
                    slowP = slowP.next
                    head = head.next

                return slowP

        return None


