class arrays {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String[] sample = new String[2];
        sample[0] = "Aditya";
        sample[1] = "ayush";

        for (String i : sample) {
            System.out.println(i);
        }

    }
}