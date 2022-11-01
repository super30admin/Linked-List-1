//T.C= O(n)
//S.C- O(1)
//   Definition for singly-linked list.
  public class reversell {
      int val;
      reversell next;
      reversell() {}
      reversell(int val) { this.val = val; }
      reversell(int val, reversell next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public reversell reverseList(reversell head) {
        reversell prev= null;
        reversell curr= head;
        
        while(curr!=null){
            reversell temp= curr.next;
            curr.next= prev;
            prev= curr;
            curr=temp;
        }
        return prev;
    }
}