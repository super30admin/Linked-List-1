/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
    //ListNode* dummy;
    ListNode* dummy = new ListNode(0);
    dummy->next = head;
    int count =0;
    ListNode* fast = dummy;
    ListNode* slow = dummy;
    while(count<=n){
        fast = fast->next;
        count++;
    } 
    while(fast!=NULL){
        slow=slow->next;
        fast = fast->next;
    }   
    ListNode * temp = slow->next;
    slow->next = temp->next;
    delete temp;
    return dummy->next;

        
    }
};


/*



class Solution {
   public: int len(ListNode* head){
        int count=0;
        while(head!=NULL){
            head= head->next;
            count++;
        }
        return count;
    }
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int length = len(head); 
        //if(n>length)return head;

        ListNode* temp=head;
        if(n>=length){
            head=head->next;
            delete(temp);
            return head;
        }
        int x = length-n-1;
        while(x--)temp=temp->next;
        ListNode* k = temp->next;
        temp->next=temp->next->next;
        delete(k);
        return head;    
    }
};


*/
