# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

#All TC on leetcode passed

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        #Here we 2 pass for loop to find length of linked list and subtract n from it to get the position index to be deleted. To optimize this approach we follow below algorithm. Firstly we create a dummy node to which slow pointer points to. Fast pointer moves until n=0. Now we begin to move both pointers by 1 node each time until fast node reached null. Here we exit the loop and connect slow pointer to its next's next node.
        #Time complexity - o(n)
        #Space complexity - O(1)
        dummy = ListNode(0,head)

        fast = head
        slow = dummy
        while n>0:
            fast = fast.next
            n-=1

        while fast:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next
        return dummy.next

        