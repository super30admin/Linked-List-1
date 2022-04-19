class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

class linkedListCycle{
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        boolean cycleFound = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycleFound = true;
                break;
            }
        }

        if(cycleFound == false) return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        linkedListCycle lc = new linkedListCycle();
        ListNode h = new ListNode(3);
        h.next = new ListNode(2);
        h.next.next = new ListNode(0);
        h.next.next.next = new ListNode(-4);
        h.next.next.next.next = h.next;
        System.out.println(lc.detectCycle(h).val);
    }
}