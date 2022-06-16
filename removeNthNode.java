// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class removeNthNode {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode start  = head;
            int length = 0;
            while(start!=null){
                length++;
                start = start.next;
            }
            System.out.println(length);
            if(length == 1){
                return null;
            }
            if(length == 2){
                if(n==1){
                    head.next = null;
                    return head;
                }
                else{
                    head =head.next;
                    return head;
                }
            }   
            length = length-n;
            if(length==0){
                head = head.next;
                return head;
            }
            int val = 1;
            start  = head;
            while(val<length){
                val++;
                start = start.next;
            }
            
            start.next = start.next.next;
            return head;
        }
        public static class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    
    }

