# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        flag=False
        if head==None:return None
        f=s=head
        while(f!=None and f.next!=None):
            s=s.next
            f=f.next.next
            if s==f:
                flag=True
                break
        if not flag:return None
        s=head
        while(s!=f):
            s=s.next
            f=f.next
        return f
        