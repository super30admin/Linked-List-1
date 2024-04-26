//Time O(n)
//Space O(1)
//Leetcode yes
//issue none
class Solution {
public:
    //With dummy
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* dummy = new ListNode();

        dummy->next = head;
        ListNode* slow = dummy;
        ListNode* fast = dummy;
        int count = 0;

        while(count < n && fast){
            fast = fast->next;
            count++;
        }
        while(fast && fast->next){
            fast = fast->next;
            slow = slow->next;
        }
        ListNode* temp = slow->next;
        slow->next = slow->next->next;
        delete(temp);
        return dummy->next;
    }
    //Without dummy
    /*  
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(!head) return NULL;

        ListNode* fast = head;
        ListNode* slow = head;
        while(n>0) {
            fast = fast->next;
            n--;
        }
        if(!fast) {
            return head->next;
        }
        while(fast->next){
            slow = slow->next;
            fast = fast->next;
        }
        slow->next = slow->next->next;
        return head;

    }*/
};
