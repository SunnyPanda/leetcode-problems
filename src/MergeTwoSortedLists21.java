public class MergeTwoSortedLists21 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2, node1);
        ListNode node3 = new ListNode(1, node2);

        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(3, node4);
        ListNode node6 = new ListNode(1, node5);

        System.out.println(mergeTwoLists(node3, node6));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode head = new ListNode();
        ListNode p3 = head;

        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                head.next = p1;
                p1 = p1.next;
            } else {
                head.next = p2;
                p2 = p2.next;
            }
            head = head.next;
        }

        if (p1 != null) {
            head.next = p1;
        } else {
            head.next = p2;
        }

        return p3.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
