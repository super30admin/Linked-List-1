# Time: O(n) => 2n because it is two pass
# Space: O(1)

# In the first pass calculate the total number of nodes in the linked list
# then calculate which node needs to be removed by subtracting n from the total number of nodes
# Here the edge case would be if the result of the substraction is 0 hence return head.next 
# because if we return head there might be 2 elements in the linked list and we might have to remove the first element
# then loop until the current pointer is on the node to be removed and prev is previous to curr
# After that just update the values and return the head
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        totalNodes = 0
        curr = head

        while curr != None:
            totalNodes += 1
            curr = curr.next

        nth = totalNodes - n
        if nth == 0:
            return head.next
        curr = head
        prev = None
        for i in range(0,nth):
            temp = curr
            curr = curr.next
            prev = temp
        prev.next = curr.next
        curr.next = None
        return head


# Time: O(n) => Single pass with two pointers
# Space: O(1)

# Create a dummy Node to handle the test case where we have to remove the head node itself or if the head itself is None
# then have two pointers slow and fast starting from the dummy node
# At first the fast pointer would go on the nth element from the start (now the fast pointer has to go total_len-n elements to reach the end of the linked list)
# We will make the slow pointer move with fast as by doing this the slow pointer would cove total_len - n elements (now there are only n elemnts left for slow pointer to go to the end)
# So slow pointer is sitting on the node whose next node should be removed and hence we do the same
# and at last return dummy.next which will be the head node or None depending on the test case
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0)
        dummy.next = head

        slow = dummy
        fast = dummy
        cnt = 0
        while cnt <= n:
            fast = fast.next
            cnt += 1
        while fast != None:
            slow = slow.next
            fast = fast.next
        temp = slow.next
        slow.next = slow.next.next
        temp.next = None
        return dummy.next