package by.tr.mod8;

public class Test1 {
    private int var1;
    private int var2;
    public void printVar1(){
        System.out.println(var1);
    }
    public void printVar2(){
        System.out.println(var2);
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }
    public int sum(){
        return this.var1+this.var2;
    }
    public int max(){
        return (var1>var2? var1:var2);
    }
}
