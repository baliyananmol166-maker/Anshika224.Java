class sum {
    int a, b;

    // constructor
    sum(int x, int y) {
        a = x;
        b = y;
    }

    int add() {
        return a + b;
    }

    public static void main(String[] args) {
        sum s = new sum(10, 20);
        System.out.println("Sum = " + s.add());
    }
}
