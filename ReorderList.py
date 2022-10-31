# Did it run successfully on LC? YES

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reorderList(self, head):
        """
        Do not return anything, modify head in-place instead.
        """
        if not head or not head.next:
            return
        slow = fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        fast = self.reverse(slow.next)
        slow.next = None
        
        slow = head
        temp = slow.next
        while fast:
            slow.next = fast
            fast = fast.next
            slow.next.next = temp
            slow = temp
            if temp:
                temp = temp.next
        
    
    def reverse(self, head):
        if not head or not head.next:
            return head
        prev = None
        cur = head
        fast = head.next
        while fast:
            cur.next = prev
            prev = cur
            cur = fast
            fast = fast.next
        cur.next = prev
        return cur

if __name__ == "__main__":
    s = Solution()
    head = [1,2,3,4]
    print(s.reorderList(head))