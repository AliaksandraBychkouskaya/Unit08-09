package by.tr.mod8;

public class UniversityTest {
    public static void main(String[] args) {

        Student st1 = new Student("Sasha",5,5,5);
        Student st2 = new Student("Iryna",2,5,5);
        Student st3 = new Student("Olga",4,2,3);
        Group kb = new Group(st1,st2,st3);

        double AverageGroupMark = (kb.getStudent1().averageMark()+kb.getStudent2().averageMark()+kb.getStudent3().averageMark())/3;
        System.out.println("Average Group Mark = "+AverageGroupMark);
        System.out.println("Average mark of "+ st1.getName()+ " = "+ st1.averageMark());
        System.out.println("Average mark of "+ st2.getName()+ " = "+ st2.averageMark());
        System.out.println("Average mark of "+ st3.getName()+ " = "+ st3.averageMark());
        int countOfBest = 0;
        if (kb.getStudent1().averageMark() == 5) countOfBest++;
        if (kb.getStudent2().averageMark() == 5) countOfBest++;
        if (kb.getStudent3().averageMark() == 5) countOfBest++;
        System.out.println(("Count of Best Student in group = "+countOfBest));
        int countof2 = 0;
        if (st1.getMarkMath() == 2) countof2++;
        if (st2.getMarkMath() == 2) countof2++;
        if (st3.getMarkMath() == 2) countof2++;
        if (st1.getMarkEnglish() == 2) countof2++;
        if (st2.getMarkEnglish() == 2) countof2++;
        if (st3.getMarkEnglish() == 2) countof2++;
        if (st1.getMarkPhysics()== 2) countof2++;
        if (st2.getMarkPhysics() == 2) countof2++;
        if (st3.getMarkPhysics() == 2) countof2++;
        System.out.println(("Count of 2 in group = "+countof2));
    }
}
