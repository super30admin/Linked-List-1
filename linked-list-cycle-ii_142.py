#Approach2: To detect cycle (using slow and fast pointer, if they meet its not linear list)
#to find start of node mathematical solution
#Assume, start to head is k, distance from k to meeting point y, length of cycle is l
#slow distance = k+ N1cycles + y
#fast distance = k+ N2cycles + y
#2*slow =fast , so  2k+2y+ 2*n1cycles = k + y + n2cycles
#k = n2-2n1 * cycle length(l) - y
#n2-2n1 is constant so k = l-y
#so head to meeting point = meeting point to head of cycle
#(start(head) to meeting point[k]) = (meeting point to start of the cycle start node[l-y])

#Time Complexity O(N) One pass for traversing Linklist
#Space Complexity O(1)
#It successfully runs on the leetcode



class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head: return None
        slow = fast = head
        cycle = False
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                cycle = True
                break
        if cycle: 
            slow = head
            while slow!=fast:
                slow = slow.next
                fast = fast.next
            return slow



#Approach1: Using hashset,the node which is repeating is the head of cycle
#Time Complexity O(N) One pass for traversing Linklist
#Space Complexity O(N)
#It successfully runs on the leetcode

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        s= set()
        cur = head
        while cur:
            if cur in s:
                return cur
            else:
                s.add(cur)
            cur = cur.next
