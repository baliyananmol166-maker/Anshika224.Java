class Test1 {

    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;   // default access

    void show() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.show();
    }
}
