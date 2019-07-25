//
// Created by shazm on 7/24/2019.
//

#include <iostream>
#include <algorithm>
#include <vector>

// Runtime: O(n)
// Space: O(1)
// Approach: Traverse with a count till the end recursively. Update count starting from end. If count == n then remove
// that node and exit.

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(n==0){
            return head;
        }
        int count = 0;
        recurr(head,n,count);

        return head;

    }

private:
    void recurr(ListNode* &node, int n, int& count){
        if(node == NULL){
            return;
        }
        if(node->next == NULL){
            count +=1;
            if(count==n){
                node = NULL;
            }
            return;
        }

        recurr(node->next, n, count); count+=1;
        if(count==n && node->next!=NULL){
            node = node->next;
        }

        return;
    }
};
int main(){
    Solution s;

    return 0;
}