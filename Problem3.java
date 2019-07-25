// https://leetcode.com/problems/linked-list-cycle-ii/
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
import java.util.HashSet;

public class linkedListCycle {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
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

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode root = head;
        ListNode temp = new ListNode(2);
        head.next = temp;
        head = head.next;
        head.next = new ListNode(0);
        head = head.next;
        head.next = new ListNode(-4);
        head = head.next;
        head.next = temp;
        System.out.println(detectCycle(root).val);
    }
}
