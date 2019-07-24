//
// Created by shazm on 7/24/2019.
//

#include <iostream>
#include <algorithm>
#include <vector>

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
};
int main(){
    Solution s;

    return 0;
}