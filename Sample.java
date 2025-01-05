// Problem 1
// Time Complexity : O(n)
// Space Complexity : O(1)
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None: return head
        prev = None
        curr = head
        temp = head.next
        while(temp!=None):
            curr.next = prev
            prev = curr
            curr = temp
            temp = temp.next
        curr.next = prev
        return curr


// Problem 2
// Time Complexity : O(n)
// Space Complexity : O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(val=-1)
        dummy.next = head
        fast = dummy
        count = 0
        while(count<=n):
            fast = fast.next
            count+=1
        slow = dummy
        while(fast!=None):
            slow = slow.next
            fast = fast.next
        temp = slow.next
        slow.next = slow.next.next
        temp.next = None
        return dummy.next
        

// Problem 3
// Time Complexity : O(n)
// Space Complexity : O(1)
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        flag = False
        while(fast!=None and fast.next!=None):
            slow=slow.next
            fast=fast.next.next
            if slow == fast:
                flag = True
                break
        if not flag: return None
        slow = head
        while(slow!=fast):
            slow = slow.next
            fast = fast.next
        return slow
