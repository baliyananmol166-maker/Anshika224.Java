class staticmethod2{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args){
        staticmethod2 s1=new staticmethod2();//object creation
        System.out.println(s1.add(5,10));//calling first add method
        System.out.println(s1.add(5,10,15));//calling second add method
    }
}