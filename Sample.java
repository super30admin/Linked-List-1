// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public ListNode reverseList(ListNode start) {
        if (start == null || start.next == null) return start;

        ListNode prev = null, curr =start, next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}


// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public:
        bool exist(ListNode *head){
            ListNode *slow = head;
            ListNode *fast = head;
            for(;fast && fast->next;){
                fast=fast->next->next;
                slow=slow->next;
                if(fast == slow)
                    return true;
            }
            return false;
        }
        ListNode *detectCycle(ListNode *head) {
            if(exist(head)){
            ListNode *slow = head;
            ListNode *fast = head;
            int flag=0;
            for(;fast && fast->next;){
                fast=fast->next->next;
                slow=slow->next;
                if(fast == slow)
                    break;
            }
            
                slow=head;
                while(slow!=fast){
                    slow= slow->next;
                    fast = fast->next;
                }
                return slow;
            }
            else
                return NULL;
        }
    };


    // Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

    struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
        struct ListNode *p, *q,*prev;
        p=q=head;
        int count;
        for(count=0;count<n ;count++)
        {
            if(p->next==NULL){
                if(count==n-1) 
                    head=head->next;
                return head;
            }
            p=p->next;
        }   
    
        while(p->next){
            p=p->next;
            q=q->next;
        }
        
        q->next=q->next->next;
        return head;
    }
    