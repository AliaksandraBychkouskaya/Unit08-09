package by.tr.mod8;

public class Test1Test {
    public static void main(String[] args) {
        Test1 Test = new Test1();
        Test.printVar1();
        Test.printVar2();
        Test.setVar1(15);
        Test.setVar2(100);
        Test.printVar1();
        Test.printVar2();
        System.out.println(Test.sum());
        System.out.println(Test.max());
    }


}
