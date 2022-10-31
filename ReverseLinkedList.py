# Did it run successfully on LC? YES

class Solution:
    def reverseList(self, head):
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
    head = [1,2,3,4,5]
    print(s.reverseList(head))
