public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            ListNode next = curr.next;
            if (curr.val == next.val) {
                curr.next = next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode curr = removeDuplicatesFromSortedList.deleteDuplicates(head);
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
