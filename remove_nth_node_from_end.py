class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head:
            return 
        curr = head
        len_ = 0 
        while curr:
            len_ += 1
            curr = curr.next 
        # print("len_", len_)
        if len_ < 2: 
            head = None
            return head
        node_num = len_ - n
        prev = None 
        curr = head
        if node_num == 0 :
            head = curr.next
            curr.next = None
            return head
        while node_num :
            prev = curr
            curr = curr.next 
            node_num -= 1
        prev.next = curr.next
        curr.next = None
        return head
