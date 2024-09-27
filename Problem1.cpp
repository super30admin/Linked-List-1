// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    //using recursion
    ListNode* reverseList(ListNode* head) {
        if(head==NULL) return NULL;
        
        if(head->next==NULL) return head;
        
        ListNode* ptr = reverseList(head->next);
        
        ListNode* last = head->next;
        last->next = head;
        head->next = NULL;
        
        //head->next->next = head;
        //head->next = NULL;
        
        return ptr;
    }
};

// Using iterative:
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode* res=NULL;
        ListNode* rem;
        ListNode* temp;
        while(head!=NULL){
            rem = head->next;
            if(res==NULL){
                res = head ;
                res->next = NULL;
            }
            else{
                temp = res;
                res = head;
                res->next = temp;
            }
            head = rem;
        }
        
        return res;
    }
};
