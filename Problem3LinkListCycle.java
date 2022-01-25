



//1st approach using hashSet using O(N) time;
// and O(N) Space Complexity

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        HashSet<ListNode> set=new HashSet<>();
        
        ListNode curr=head;
        while(!set.contains(curr) && curr!=null){
            set.add(curr);
            curr=curr.next;
        }
        return curr;
    }
}


//Efficient Way:
//Taking two pointers
//TC:O(N)
//SC:O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slowptr=head;
        ListNode fastptr=head;
        
        //Need to check null as well, as test of null is included as well;
        if(head==null){
            return null;
        }
    
        //need to check if there is a cycle or not as well  missing to check this thing;
        boolean hasCycle=false;
        while(fastptr!=null && fastptr.next!=null){     //also, fastptr!=null is to be checked firs then check fastptr.next if qual to null;
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
            if(slowptr==fastptr){
                hasCycle=true;
                break;
            }
        }
        
        if(hasCycle==false){
            return null;
        }
        slowptr=head;
        while(slowptr!=fastptr){
            slowptr=slowptr.next;
            fastptr=fastptr.next;
        }
        return fastptr;
    }
}
