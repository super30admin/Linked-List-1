# Brute Force --> two pass: - in 1st pass len of LL - in 2nd pass remove (len - n)
# TC - O(n) & SC - O(1)


# add dummy node pointing to head then slow - fast = n move slow and fast by 1 and when fast reaches to end delete the node and return dummy.next
# TC - O(n) & SC - O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head == None:
            return None
        dummy = ListNode(-1)
        dummy.next = head
        
        slow = dummy
        fast = dummy
        count = 0
        
        while count<=n:
            fast = fast.next
            count += 1
            
        while fast != None:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next