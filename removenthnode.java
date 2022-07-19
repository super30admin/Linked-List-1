// time complexity: o(n)
//space complexity: o(1)
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         //find the length of the list
//         int length = 0;
//         ListNode curr = head;
//         while(curr!=null){
//             curr = curr.next;
//             length++;
//         }
//         if(length == n){
//             return head.next;
//         }
//         int nodebefore_n = length - n - 1;
//         curr = head;
//         for(int i = 0; i< nodebefore_n; i++){
//             curr = curr.next;
//         }
//         curr.next = curr.next.next;
//         return head;
//     }
// }


//second approach
//space complexity: o(n)
//time complexity: o(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast  = dummy;
        int count = 0;
        while(count<=n){
            count++;
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;

        }
        slow.next = slow.next.next;
        return dummy.next;


    }
}