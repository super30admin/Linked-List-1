/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//time complexity: O(n)
//space complexity: O(1)
public class CycleSolution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode detectCycle(ListNode head) {
        
        // ListNode temp = head;
        // Set<ListNode> visited = new HashSet<>();
        // while (temp != null)
        // {
        //     if (!visited.contains(temp))
        //     {
        //         visited.add(temp);
        //     }
        //     else
        //     {
        //         return temp;
        //     }
        //     temp = temp.next;
        // }
        // return temp;
        
        
        // Method 2: Fast and Slow pointers
        ListNode slow = head, fast = head;
        int len = 0;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)   
            {
                len = findLen(slow);
                break;
            }
        }
        return findStart(head, len);
    }
    
    public static ListNode findStart(ListNode head, int len)
    {
            
            ListNode node1 = head;
            ListNode node2 = head;
            if (len == 0)
                return null;
            while (len > 0)
            {
                node1 = node1.next;
                len--;
            }
            while (node1 != node2)
            {
                node1 = node1.next;
                node2 = node2.next;
            }
        return node1;
    }
    
    public static int findLen(ListNode slow)
    {
        ListNode curr = slow;
        int len = 0;
        do
        {
            curr = curr.next;
            len++;
        }
        while (curr != slow);
        return len;
            
    }
}