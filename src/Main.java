import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1 номер
        System.out.println("Первая задача ");
        String enterStr;
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        enterStr = scanner.nextLine();
        System.out.println("Введите число: ");
        N = scanner.nextInt();

        if (N <= 0){
            N = 1;
        }

        System.out.println("Ответ: ");
        for (int i = 0; i < N; i++){
            System.out.println(enterStr);
        }

        //2 номер
        System.out.println("Вторая задача: ");
        System.out.println("Введите количество раз: ");
        int numOfTimes = scanner.nextInt();
        System.out.println("Введите количество литров: ");
        int numOfLitres = scanner.nextInt();

        if (numOfTimes > 0 && numOfLitres > 0){
            int totalVolume = 0;
            for (int i = 1; i < 16; i++){
                totalVolume += numOfTimes * numOfLitres;
                System.out.println("К " + i + " неделе будет выпито " + totalVolume + " литров жидкости");
            }

            if(totalVolume >= 120){
                System.out.println("Студент принят в IT-клуб!");
            }

            else{
                System.out.println("Студент не принят в IT-клуб!");
            }
        }
        else{
            System.out.println("Некорректный ввод данных.");
        }


        scanner.close();
    }
}
