package com.company;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        int[] array = new int[49];
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 0) {
                array[counter] = i;
                counter++;
                System.out.println(i);
            }

        }
        int [] SecondArray = new int[21];
        for (int i = 0; i<=20;i++){
            if (i%2==0){
                SecondArray[i] = (int) Math.round(Math.random() * 9);
            }
            else{
                SecondArray[i] = 0;
            }
            System.out.println(SecondArray[i]);

        }
        int [] one = new int [6];
        int firstCount = 0;
        int [] two = new int [6];
        int secondCount = 0;
        int [] tree = new int [6];
        int Thirdcount  = 0;
        for (int i=0; i<5; i++) {
            one[i] = (int) Math.round(Math.random() * 5);
            firstCount = firstCount + one[i];
            two[i] = (int) Math.round(Math.random() * 5);
            secondCount = secondCount + two[i];
            tree[i] = (int) Math.round(Math.random() * 5);
            Thirdcount = Thirdcount + tree[i];

            System.out.print(one[i]+" ");

            System.out.print(two[i] +" ");

            System.out.print(tree[i]+ " ");
        }
        if(firstCount > secondCount && secondCount>Thirdcount){
            System.out.println( "Cумма"+firstCount+ "найбільша сумма в першому масиві");
        }
        else if (secondCount>firstCount && firstCount > Thirdcount){
            System.out.println("Сумма" + secondCount +" найбільша сумма в 2 масиві");
        }
        else {
            System.out.println("Сумма" + Thirdcount+"найбільша сумма в 3 масиві");
        }
        int []FirstRandomArr = new int [11];
        int []SecondRandomArr = new int [11];
        int [] ThirdEmptyArr = new int [11];
        for (int i = 0; i<=10;i++){

            FirstRandomArr[i] = (int) Math.round(Math.random() * 10);
            SecondRandomArr[i] = (int) Math.round(Math.random() * 10);
            ThirdEmptyArr[i] = SecondRandomArr[i]+FirstRandomArr[i];
            System.out.println(ThirdEmptyArr[i]);
        }
        
        int rahunok=0;
        int [] RandomArrayLen15 = new int [16];
        for (int i = 0;i<15;i++){
            RandomArrayLen15[i] = (int) Math.round(Math.random() * 10);
            System.out.print(RandomArrayLen15[i]);
            if(RandomArrayLen15[i]%2==0){
                rahunok = rahunok+1;
            }
        }
        System.out.println(rahunok);
    }
}
