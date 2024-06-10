//Leetcode 206: Reverse Linked List
//https://leetcode.com/problems/reverse-linked-list/
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
    public ListNode reverseList(ListNode head) {
        //Method 1: Iteratively
        /*
        //initilizing the variables
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        //keep running until we get to the end of the list
        while(curr != null){
            next = curr.next; //next is just next
            curr.next = prev; //make sure the next node points back here now
            prev = curr; //the head now becomes the previous
            curr = next; //the switch to be reversing pointers for next node
        }
        return prev; //return the newest end of the list (since we stop the loop when current is null which means prev would be the last Node with things in it)
        */
        //Time Complexity: O(N)
        //Space Complexity: O(1)

        //Method 2: Doing it all Recursively

        //base case, when we at only 1 node, nothing else to connect to, or we already have a reversed list
        if (head == null || head.next == null){
            return head;
        }
        ListNode reversedListHead = reverseList(head.next); //save a pointer to the next node
        head.next.next = head; //tell the next node to point at the current node
        head.next = null; //tell the next node to not have a value so that it can return the base case
        return reversedListHead; //return the last node of the reversed list
    }

    //time Complexity: O(N)
    //space Complexity: O(N)
}