class Main {
    public static void counting(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int frequency = 0;
            for (int j = 0; j < len; j++) {
                if (arr[i] == arr[j]) {
                    frequency++;
                    continue;
                }
            }
            String res = frequency > 1 ? "s" : "";
            System.out.println("The element " + arr[i] + " occurred " + frequency + " time" + res);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 4, 6,};
        counting(arr);
    }
}