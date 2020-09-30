package ru.geekbrains.Catch_the_drop;

public class Main {

    public static void main(String[] args) {
//        №1
        int[] num = new int[]{1, 1, 0, 1, 0, 1, 0};
        System.out.print("До: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
            if (num[i] == 0) num[i] = 1;
            else num[i] = 0;
        }
        System.out.print("После:  ");
        for (int i : num) {
            System.out.print(i + " ");
        }
//  Непонял как выполнить несколько заданий в одном проекте, сделал так.
//        №2


        int[] arr = new int[22];
        for (int i = 0; i <= 22; i += 3) {
            arr[i] = i;
            System.out.println(arr[i]);
        }

//        №3
        int[] Num = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxNum = Num.length;
        for (int i = 0; i < maxNum; i++) {
            if (Num[i] < 6)
                Num[i] = Num[i] * 2;
        }
        for(int i = 0; i < maxNum; i++)
        {

            System.out.print(Num[i]+" ");
        }

//        №4
        int[][] qu = new int[4][4];
        for(int i = 1; i<4;i++){
            for (int j = 0; j < 4;j++){
                qu[i][j] = 1;
                System.out.println(qu[i][j] + " ");
            }
        }
//        №5
        int[] mass = {1,2,3,4};
        int min = mass[0];
        int max = mass[0];
        for(int x: mass){
            if(x < min) min = x;
        }
        System.out.print("Минимум" + min );
        for(int y: mass){
            if(y>max) max = y;
        }
        System.out.println("Максимум" + max);









    }
}
