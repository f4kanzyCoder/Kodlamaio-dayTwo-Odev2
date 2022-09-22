package org.example;

public class Main {
    public static void main(String[] args) {
        String message="Today weather is nice";
        String newMessage=giveCity();

        System.out.println(newMessage);
        int sum=addition(1,5);
        System.out.println(sum);

        int sum2=addition2(1,9,0,7);
        System.out.println(sum2);
    }
    public static void add(){
        System.out.println("Added");
    }
    public static void delete(){
        System.out.println("Deteled");
    }
    public static void update(){
        System.out.println("Updated");
    }
    public static int addition(int num1,int num2){
        return num1+num2;
    }
    public static String giveCity(){
        return "Istanbul";
    }

    public static int addition2(int ... numbers){
        int sum=0;
        for (int num:numbers) {
            sum+=num;
        }
        return sum;
    }
}