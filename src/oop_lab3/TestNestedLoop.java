package oop_lab3;

public class TestNestedLoop {
    public static void main(String[] args) {

        for (int i=1;i<=8;i++ ){
            //statement
            for (int j=1;j<=i;j++) {
                //statement
                if (i==8||i==j||j==1){
                System.out.print("*\t");
            }else {
                System.out.print("");
            }//j
            System.out.println();

        }//i




    }//main

}//class
