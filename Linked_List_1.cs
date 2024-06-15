using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


namespace S30_Problems
{
    class Program
    {
        static void Main(string[] args)
        {
            Program p = new Program();
        }

        // Time Complexity : O(n) where n is the number of nodes in the LinkedLists
        // Space Complexity : O(n) for the reccursion stack
        public ListNode ReverseList(ListNode head) {
            if (head == null || head.next == null)
            {
                return head;
            }
            ListNode res = ReverseList(head.next);
            head.next.next = head;
            head.next = null;
            return res;
        }

        // Time Complexity : O(n) where n is the number of nodes in the LinkedLists
        // Space Complexity : O(1)
        public ListNode RemoveNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode follow = dummy;
            while(head!=null){
                head = head.next;
                if(n<=0) follow = follow.next;
                n--;            
            }
            follow.next = follow.next.next;
            return dummy.next;
        }
    }
}
