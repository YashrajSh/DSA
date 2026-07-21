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
    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }
        ListNode current =head;
        int length=0;
        while(current != null){
            length +=1 ;
            current =current.next; 
        }
        current =head;
        int targetindex= length / 2;
        for (int i = 0; i < targetindex - 1; i++) {
            current = current.next;
        }
        current.next=current.next.next;


    return head;
    }
}