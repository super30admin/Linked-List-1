#include<iostream>
#include<vector>

using namespace std;

/*
Using the three pointers curr,prev,fast

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 
Condition when there are only one and two nodes for the base case
Also when you exit the while loop making sure that your current is connect to the prev element


// Your code here along with comments explaining your approach
Take three pointers prev,curr,fast 
point curr to prev (reverse link)
jump from prec to curr, curr to fast amd fast to fast.next

*/

typedef struct ListNode{
    int val;
    ListNode* next;
    ListNode():val(0),next(nullptr){};
    ListNode(int x):val(x),next(nullptr){};

}ListNode;

class Solution_1 {
public:
    ListNode* reverseList(ListNode* head) {
        if(head == nullptr || head->next == nullptr) return head;
        ListNode* prev{nullptr};
        ListNode* curr{head};
        ListNode* fast{head->next};
        while(fast!=nullptr){
            curr->next = prev;
            prev = curr;
            curr = fast;
            fast = fast->next;
        }
        curr->next = prev;
        return curr;
    }
};

int main(int argc, char const *argv[])
{
    /* code */
    return 0;
}


// Using reccursion



