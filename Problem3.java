//https://leetcode.com/problems/linked-list-cycle-ii/
import java.util.HashSet;

public class linkedListCycle {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    // Time Complexity :O(n) -> number of nodes
    // Space Complexity :O(n) -> hashSet
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No
    //
    // Your code here along with comments explaining your approach
    // 1. Create a hashset and add first node.
    // 2. For each next node in the given linked list check if the next node is present in the hashset
    // 3. If it is present then return next node, else add it to hashset.
    // 4. If no cycle is detected or we reached the last node and it is  null then return null.
    public static ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while(head!=null){
            if(!set.contains(head))
                set.add(head);
            else{
                return head;
            }
            head = head.next;
        }
        return null;
    }
    
    // Time Complexity :O(n) -> number of nodes
    // Space Complexity :O(1) 
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No
    //
    // Your code here along with comments explaining your approach
    // 1 .  Use Floyd's algorithm . Create two pointers fast and slow.Slow moves one step and fast moves two steps.
    // 2 . If a loop is present then these two pointers will meet at some point in the point ,
    //     else if fast pointer reaches null or it's next node reaches null RETURN null;
    // 3 .  Now using Floyd'' algorithm ,If a loop is present i.e they meet at a point then again start slow pointer from head(starting node),
    //      move both slow and fast pointers single steps , now they will meet at start of the loop.
    public ListNode detectCycle2(ListNode head) {
        if(head == null || head.next == null)   return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                slow = head;
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode root = head;
        ListNode temp = new ListNode(2);
        head.next = temp;
        head = head.next;
        head.next = new ListNode(0);
        head = head.next;
        head.next = new ListNode(-5);
        head = head.next;
        head.next = temp;
        System.out.println(detectCycle(root).val);
    }
}
