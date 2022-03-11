public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60};
        int k = 30;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                    continue;
            }
            System.out.print(a[i] + " ");
        }
     }
}
