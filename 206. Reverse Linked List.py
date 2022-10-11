# Using Stack(recursion) - TC & SC - O(n)

# 3 pointers --> TC - O(n) & SC O(1)

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return head
        rev = self.reverseList(head.next) 
        
        head.next.next = head
        head.next = None
        
        return rev
    


# 3 pointers --> TC - O(n) & SC O(1)

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return head
        prev = None
        cur = head
        fast = head.next
        while fast != None:
            cur.next = prev
            prev = cur
            cur = fast
            fast = fast.next
        cur.next = prev
        return cur