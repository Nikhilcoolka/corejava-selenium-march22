package org.matrix.alpha.kamlesh.constructor;

public class StudentData {

    public int CalculatePercentage(int sub1,int sub2,int sub3){
       int d = (sub1 + sub2 + sub3)/3;
       return d;
    }
    public int CalculatePercentage1(int sub1,int sub2,int sub3,int sub4) {
        int e = (sub1+sub2+sub3+sub4)/4;
        return e;
    }
    public int CalculatePercentage2(int sub1,int sub2,int sub3,int sub4,int sub5) {
        int h = (sub1+sub2+sub3+sub4+sub5)/5;
        return h;
    }

    public static void main(String[] args) {

        int[] subject = new int[5];
        subject[0] = 80;
        subject[1] = 90;
        subject[2] = 70;
        subject[3] = 50;
        subject[4] = 60;

        StudentData studentData = new StudentData();
        studentData.CalculatePercentage(subject[0],subject[1],subject[2]);
        int p = studentData.CalculatePercentage(80,90,70);
        System.out.println("Gayatri percentage is " +p);
        int k = studentData.CalculatePercentage1(80,90,70,50);
        System.out.println("Shubham percentage is " +k);
        int l = studentData.CalculatePercentage2(80,90,70,50,60);
        System.out.println("Anand Percentage is " +l);
        studentData.CalculatePercentage1(subject[0],subject[1],subject[2],subject[3]);
        studentData.CalculatePercentage2(subject[0],subject[1],subject[2],subject[3],subject[4]);

    }
}
