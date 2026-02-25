interface Add {
    int sum(int a, int b);
}

public class test1 {
    public static void main(String[] args) {
        
        Add obj = new Add() {
            public int sum(int a, int b) {
                return a + b;
            }
        };
        
        System.out.println(obj.sum(5, 3));
    }
}