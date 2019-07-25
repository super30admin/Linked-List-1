//
// Created by shazm on 7/24/2019.
//

#include <iostream>
#include <algorithm>
#include <vector>

// Runtime: O(n)
// Space: O(1)
// Approach: Use floyd's algorithm to check for loop. Then use the fast and slow pointers to find the loop starting point.

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if(head == NULL){return NULL;}

        ListNode* fast;
        ListNode* slow = head;

        if(checkIfLoop(head,slow,fast)){
            while(slow!=fast){
                slow = slow->next;
                fast = fast->next;
            }
            delete slow;
            return fast;
        }

        return NULL;
    }
private:
    bool checkIfLoop(ListNode* head,ListNode* slow, ListNode* &fast){
        if(head == NULL){
            return false;
        }

        if(head->next!=NULL){
            fast = head->next;
        }else{fast = NULL;}

        while(slow!= NULL && fast!= NULL){
            if(slow == fast){
                fast = fast->next;
                return true;
            }
            slow = slow->next;
            if(fast->next!= NULL && fast->next->next!=NULL){
                fast = fast->next->next;
            }else{
                fast = NULL;
            }
        }
        return false;
    }
};

int main(){
    Solution s;

    return 0;
}