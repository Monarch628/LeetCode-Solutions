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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean overFlow = false;
        ListNode current = null;
        ListNode head = new ListNode(0);
        ListNode answer = head;

        while(l1 != null && l2 != null){
            int currentNum = l1.val + l2.val;
            
            if(overFlow){
                currentNum++;
                overFlow = false;
            }

            if(currentNum >= 10){
                currentNum -= 10;
                overFlow = true;
            }
            
            current = new ListNode(currentNum, null);
            head.next = current;
            head = current;
            
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 == null && l2 != null) {
            int currentNum = l2.val;
            
            if(overFlow){
                currentNum++;
                overFlow = false;
            }

            if(currentNum >= 10){
                currentNum -= 10;
                overFlow = true;
            }
            
            current = new ListNode(currentNum, null);
            head.next = current;
            head = current;
            
            l2 = l2.next;
        }

        while(l1 != null && l2 == null) {
            int currentNum = l1.val;
            
            if(overFlow){
                currentNum++;
                overFlow = false;
            }

            if(currentNum >= 10){
                currentNum -= 10;
                overFlow = true;
            }
            
            current = new ListNode(currentNum, null);
            head.next = current;
            head = current;
            
            l1 = l1.next;
        }
    
        if(overFlow) {
            current = new ListNode(1, null);
            head.next = current;
            head = current;
            overFlow = false;
        }
        return answer.next;
    }
}