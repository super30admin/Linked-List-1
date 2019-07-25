//
// Created by shazm on 7/24/2019.
//

#include <iostream>
#include <algorithm>
#include <vector>

// Runtime: O(n) - Iterative and Recursive
// Space: O(n) - Iterative | O(1) recursive.
// Approach:
// Iterative - add to vector till the end of list. then traverse the vector in reverse and create new ListNodes.
// Recursive - Traverse to the end and assign the last element as head. Traverse back and assign head->next to the coming elements with their next as NULL.

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(head == NULL){
            return NULL;
        }
        vector<int> vec;
        while(head!=NULL){
            vec.push_back(head->val);
            head = head->next;
        }
        ListNode* root = new ListNode(vec[vec.size()-1]);
        head = root;
        for(int x = vec.size()-2; x>=0; x--){
            ListNode* node = new ListNode(vec[x]);
            head->next = node;
            head = node;
        }
        return root;
    }

    ListNode* RecurrsiveReverseList(ListNode* head) {
        if(head == NULL){
            return NULL;
        }
        ListNode* Node = head;
        recurr(head, Node);
        return head;
    }

private:
    ListNode* recurr(ListNode* &head, ListNode* Node){
        if(Node->next == NULL){
            head = Node;
            return Node;
        }

        ListNode* node = recurr(head, Node->next);
        node->next = Node;
        node = node->next;
        node->next = NULL;
        return node;
    }
    //ListNode* reverseList(ListNode* head) { //much efficient memory allocation recursive solution
    //        if(head == NULL){
    //            return NULL;
    //        }
    //        ListNode* temp;
    //        recurr(head, head,temp);
    //        delete temp;
    //        return head;
    //    }
    //    ListNode* recurr(ListNode* &head, ListNode* Node, ListNode* temp){
    //        if(Node->next == NULL){
    //            head = Node;
    //            return Node;
    //        }
    //
    //        temp = Node;
    //        Node = recurr(head, Node->next, temp);
    //        Node->next = temp;
    //        Node = Node->next;
    //        Node->next = NULL;
    //        return Node;
    //    }
};
int main(){
    Solution s;

    return 0;
}