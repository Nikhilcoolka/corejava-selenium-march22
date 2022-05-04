package org.matrix.alpha.kamlesh.zPractice;

public class AdditionOfOdd {


    public void m1(){
        int num=1;
        int sum=0;


        if(num<=100){     // 1 is smaller then 100
            if((num % 2)!=0){
                sum=sum+num;
            }
            num++;
        }
        System.out.println(sum);

    }

    public void m2(){
        int sum = 0;       //sum variable intialize with zero
        for (int i =1;i<=100; i++){

            if (i % 2 !=0 ){        //If the number is not divisible by 2 then its an odd number
                sum= sum + i;
            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        AdditionOfOdd obj=new AdditionOfOdd();
        obj.m1();
        AdditionOfOdd obj2=new AdditionOfOdd();
        obj2.m2();
    }
}

