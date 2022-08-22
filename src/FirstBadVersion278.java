public class FirstBadVersion278 {

    public static void main(String[] args) {

    }

    public int firstBadVersion(int n) {
        return search(1, n);
    }

    private int search(int l, int r) {
//        int mid = l + (r - l) / 2;
//        if (isBadVersion(mid) && !isBadVersion(mid - 1)) {
//            return mid;
//        }
//        if (isBadVersion(mid)) {
//            return search(1, mid - 1);
//        }
//        return search(mid + 1, r);

        int mid = l + (r - l) / 2;
        if (isBadVersion(mid)) {
            if (mid == 1 || !isBadVersion(mid - 1)) {
                return mid;
            }
            return search(l, mid - 1);
        } else {
            return search(mid + 1, r);
        }
    }

    boolean isBadVersion(int version) {
        return false;
    }
}
