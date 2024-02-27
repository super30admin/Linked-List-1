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
    /*
    Time: O(N)
    Space: O(1)

    Maintain two pointers (curr and nxt) (the pairs of adjacent nodes), store the next pointer in temporary variable, reverse curr and nxt and move to the node of temporary pointer

    */
    ListNode* reverseList(ListNode* head) {
        if(head==nullptr)  return head;

        ListNode *curr = head, *nxt = head->next;

        while(nxt != nullptr){
          ListNode* tmp = nxt->next;
          nxt->next = curr;
          if(curr->next == nxt)  curr->next = nullptr; //only true for original head node, set its next to nullptr 
          curr = nxt;
          nxt = tmp;
        }

        return curr;
    }
};
