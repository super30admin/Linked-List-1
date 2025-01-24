// Time complexity : O(n)
// Space Complexity : O(1)

Class RemoveNNode {
public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
        return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int cnt = 0;
        while(cnt <= n){
        cnt++;
        fast = fast.next;
        }
        while(fast !=null){
        slow = slow.next;
        fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;

        }
        }