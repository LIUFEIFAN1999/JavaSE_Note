package Lab2020.lab1;

import java.util.Random;

public class Dice {
    private static Dice face1;
    private static Dice face2;
    private static Dice face3;
    private static Dice face4;
    private static Dice face5;
    private static Dice face6;
    private static int count1 = 0;
    private static int count2 = 0;
    private static int count3 = 0;
    private static int count4 = 0;
    private static int count5 = 0;
    private static int count6 = 0;
    private int n;

    static{
        face1 = new Dice(1);
        face2 = new Dice(2);
        face3 = new Dice(3);
        face4 = new Dice(4);
        face5 = new Dice(5);
        face6 = new Dice(6);
    }

    private Dice(int n){
        this.n = n;
    }

    public static Dice getDice(int n){
            switch (n) {
                case 1:
                    count1++;
                    return face1;
                case 2:
                    count2++;
                    return face2;
                case 3:
                    count3++;
                    return face3;
                case 4:
                    count4++;
                    return face4;
                case 5:
                    count5++;
                    return face5;
                default:
                    count6++;
                    return face6;
            }
    }

    public static void main(String[] args) {
        int n, total;
        Random random = new Random(47);
        System.out.println("Randomly throw 1000 Dices：");
        for(int i=0; i<1000; i++)
        {
            n = random.nextInt(6)+1;
            System.out.println("Point "+getDice(n).n);
        }
        System.out.println("Statistic：");
        System.out.println("Point 1："+Dice.count1+" Times");
        System.out.println("Point 2："+Dice.count2+" Times");
        System.out.println("Point 3："+Dice.count3+" Times");
        System.out.println("Point 4："+Dice.count4+" Times");
        System.out.println("Point 5："+Dice.count5+" Times");
        System.out.println("Point 6："+Dice.count6+" Times");
        total = Dice.count1 + Dice.count2 +Dice.count3
                + Dice.count4 + Dice.count5 + Dice.count6;
        System.out.println("Total："+total+" Times");
    }
}
