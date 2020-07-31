//Time Complexity:O(number of nodes in the list)
//Space Complexity:O(1)
/*Approach 
-taking two pointers fast and slow, moving fast at 2x speed and slow at 1x speed
-whenever they meet cycle is detected keeping boolean flag for it
-resetting slow again to the beginning, and moving both fast and slow at 1x speed 
to detect the point where cycle started
*/

public class CycleInLL {
    static class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
        }
       
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast= fast.next;
        }
        return fast;
    }

    public static void main(String args[]){
        CycleInLL obj = new CycleInLL();
        ListNode n = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        n.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        System.out.println("Cycle starts at "+obj.detectCycle(n).val);

    }
}