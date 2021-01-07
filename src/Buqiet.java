import java.util.Scanner;

public class Buqiet {


    public static void main(String[] args) {
        System.out.println("Введите желаемое кол-во цветов в букете: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        flowersTotal(number);
    }

    public static Flowers getRandomFlower() {


        int flowersBuqiet = (int) (Math.random() * 3) + 1;
        if (flowersBuqiet == 1) {
            return new Tulip();
        }
        if (flowersBuqiet == 2) {
            return new Roses();
        } else if (flowersBuqiet == 3) {
            return new Gvozdiki();

        } else
            return null;
    }

    public static void flowersTotal(int a) {
        float price = 0;
        System.out.println("Сформирован букет из " + a + " цветов:");
        for (int i = 1; i <= a; i++) {
            Flowers flower = getRandomFlower();
            System.out.println("#" + i + " " + flower);
            price = flower.getCost() + price;
        }
        System.out.println("Стоимость букета: " + price);
    }
}


