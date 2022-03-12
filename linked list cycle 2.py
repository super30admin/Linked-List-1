# Time Complexity = O(n)
# Space Complexity - O(1)
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head==None:
            return None
        flag = False
        s = head
        f = head
        while f!=None and f.next!=None:
            s = s.next
            f = f.next.next
            if f==s:
                flag=True
                f = head
                break
        if not flag:
            return None
        while f!=s:
            f=f.next
            s=s.next
        return s
