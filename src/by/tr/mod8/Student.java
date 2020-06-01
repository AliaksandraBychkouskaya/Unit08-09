package by.tr.mod8;

public class Student {
    private String name;
    private int markMath;
    private int markEnglish;
    private int markPhysics;
    Student(String _name,int _markMath,int _markEnglish,int _markPhysics){
        this.name = _name;
        this.markEnglish = _markEnglish;
        this.markMath = _markMath;
        this.markPhysics = _markPhysics;
    }
    public double averageMark (){
        return (this.markPhysics + this.markMath + this.markEnglish) /3.0;
    }
    public int getMarkEnglish() {
        return markEnglish;
    }

    public int getMarkMath() {
        return markMath;
    }

    public int getMarkPhysics() {
        return markPhysics;
    }

    public String getName() {
        return name;
    }
}
