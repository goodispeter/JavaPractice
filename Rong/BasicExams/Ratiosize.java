package BasicExams;

import java.util.Scanner;

public class Ratiosize {
    
    public static void main (String[] args){

        int temp = 0;
        System.out.println("請輸入x");
        Scanner x = new Scanner(System.in);
        int numX = x.nextInt();
        System.out.println("請輸入y");
        Scanner y = new Scanner(System.in);
        int numY = x.nextInt();
        System.out.println("請輸入z");
        Scanner z = new Scanner(System.in);
        int numZ = x.nextInt();
        if (numX>numY){
            temp=numX;
            numX=numY;
            numY=temp;
        }
        if (numX>numZ){
            temp=numX;
            numX=numZ;
            numZ=temp;
        }
        if (numY>numZ){
            temp=numY;
            numY=numZ;
            numZ=temp;
        }
        System.out.println("X+"+"Y+"+"Z="+numX +","+numY+","+numZ);
    }
}
