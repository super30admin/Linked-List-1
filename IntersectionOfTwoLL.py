# Did it run successfully on LC? YES
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def getIntersectionNode(self, headA, headB):
        lenA = 0
        lenB = 0
        cur = headA
        while cur:
            lenA += 1
            cur = cur.next
        
        cur = headB
        while cur:
            lenB += 1
            cur = cur.next
            
        while lenA > lenB:
            headA = headA.next
            lenA -= 1
        while lenB > lenA:
            headB = headB.next
            lenB -= 1
            
        while headA != headB:
            
            headA = headA.next
            headB = headB.next
            
        return headA

if __name__ == "__main__":
    s = Solution()
    intersectVal = 8
    listA = [4,1,8,4,5]
    listB = [5,6,1,8,4,5]
    skipA = 2
    skipB = 3
    print(s.getIntersectionNode(listA, listB))
