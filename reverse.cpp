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
    ListNode* reverseList(ListNode* head) {

/************************************************************************/

                NORMAL SOLUTION

    //     ListNode* temp = head;
    //     ListNode* curr = head;
    //     ListNode* prev = NULL;
    //     while(curr!=NULL){
    //         temp = temp->next;
    //         curr->next= prev;
    //         prev=curr;
    //         curr = temp;

    //     }

    //     head = prev;
        
    // return head;


/**********************************************************************************/


/**********************************************************************************/
                        Recursion Solution



/**********************************************************************************/
        ListNode* curr = head;
        ListNode* prev = NULL;

        reverse(head,curr,prev);

    return head;

    }


        void   reverse(ListNode* &head,ListNode* curr,ListNode* prev){
            if(curr == NULL){
                head = prev;
                return;
            }

            ListNode* temp = curr->next; 
            reverse(head,temp,curr);
            curr->next = prev;

        }


/**********************************************************************************/
};