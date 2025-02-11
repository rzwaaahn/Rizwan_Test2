class Biggest {
    private int[] array;
    public Biggest(int[] array) {
        this.array = array;
    }
    public void display() {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The largest element in the array is: " + max);
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 30, 25};
        Biggest obj = new Biggest(numbers);
        obj.display();
    }
}