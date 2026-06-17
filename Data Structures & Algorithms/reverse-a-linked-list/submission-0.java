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
        ListNode prev = null;
        ListNode currt = head;

        while(currt!=null){
            ListNode temp = currt.next;
            currt.next = prev;
            prev = currt;
            currt = temp;
        }
        return prev;
    }
}
