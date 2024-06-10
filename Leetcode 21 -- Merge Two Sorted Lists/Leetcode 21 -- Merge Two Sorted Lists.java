//Leetcode 21: Merge Two Sorted Lists
//https://leetcode.com/problems/merge-two-sorted-lists/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(); //creating this dummy node to handle base case
        ListNode tail = dummy; //start the first node of the final linked list here
        //loop while both lists aren't empty yet
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){ //if the value of the first list less than second then add the first list's node to the final list
                tail.next = list1; //set current node to point at the next node
                list1 = list1.next; //change so that the next node is now the current node we checking for list 1
            }
            else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next; //move on to the next node in the final list so we can check the node
        }
        //if one of the list end out of space, connect it to the end of the other list so we can link it to the final list faster
        if (list1 != null) tail.next = list1;
        else if (list2 != null) tail.next = list2;
        return dummy.next; //return the first node in the list
    }
}

//time complexity: O(N)
//space complexity: O(N)