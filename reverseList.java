
    class reverseList {
        public ListNode reverselist(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
        ListNode reversed = reverseList(head.next);
        System.out.println("head.val"+ head.val);
        System.out.println("reversed"+ reversed.val); 
        head.next.next = head;
        head.next = null;
        return reversed;
        }
    }