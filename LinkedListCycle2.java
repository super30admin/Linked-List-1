// Time Complexity : O(n)
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes

    public ListNode detectCycle(ListNode head) {
        
       // if(head == null || head.next == null) return null;
        int counter = 0;
        Boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;
        
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
                fast = fast.next;
                //counter++;
            }
        
        
        return slow;
    }
}