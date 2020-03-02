public class Solution {
    
        //Using Two pointers 
       public ListNode detectCycle(ListNode head) {
        
           if(head == null) return null;
           ListNode slow = head;
           ListNode fast = head;
           boolean cycle = false;
           
           while(fast != null && fast.next != null)
           {
               slow = slow.next;
               fast = fast.next.next;
               if(slow == fast)
               {
                  cycle = true;
                  break; 
               }
                   
           }
           
           if(cycle==false)
           {
               return null;
           }
             
          
           slow = head;
         
           while(slow != fast)
           {
                  slow = slow.next;
                  fast = fast.next;
           }

           return fast;
     
    }
    
        // BruteForce   
//     public ListNode detectCycle(ListNode head) {
        
        
//         HashSet<ListNode> hs = new HashSet<>();
//         while(head !=null)
//         {
//             if(hs.contains(head.next))
//                 return head.next;
//             hs.add(head);
//             head = head.next;
//         }
        
//         return head;
//     }
}
