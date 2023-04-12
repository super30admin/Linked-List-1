/**
 * TC - O(n)
 * SC - S(1)
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int totalNumberOfNode = 0;
        ListNode* dummy = new ListNode(0,head);
        ListNode* p = dummy;
        ListNode* p2 = dummy;
        for(int i =0;i<n;i++){
            p= p->next;
        }
        while(p->next != nullptr){
            p=p->next;
            p2=p2->next;
        }
        p2->next = p2->next->next;

       return dummy->next; 
    }
};