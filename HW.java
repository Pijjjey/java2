public class HW {
    public static void main(String[] args) {
        //1)Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        String first = "f i ght C l U b";
        String second = "C l ";
        if (first.contains(second)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        //2)Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке)
        if (second.contains(first)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        //4)Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        
        int num1 = 3;
        int num2 = 56;
        StringBuilder FirstLine = new StringBuilder();
        StringBuilder SecondLine = new StringBuilder();
        StringBuilder ThirdLine = new StringBuilder();

        FirstLine = FirstLine.append(num1 + " + " + num2 + " = " + (num1+num2));
        SecondLine = SecondLine.append(num1 + " - " + num2 + " = " + (num1-num2));
        ThirdLine = ThirdLine.append(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(FirstLine);
        System.out.println(SecondLine);
        System.out.println(ThirdLine);

        //5)Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

        /*FirstLine = FirstLine.insert(7, "равно");
        FirstLine = FirstLine.deleteCharAt(12);
        SecondLine = SecondLine.insert(7, "равно");
        SecondLine = SecondLine.deleteCharAt(12);
        ThirdLine = ThirdLine.insert(7, "равно");
        ThirdLine = ThirdLine.deleteCharAt(12);

        System.out.println(FirstLine);
        System.out.println(SecondLine);
        System.out.println(ThirdLine);*/

        //6)Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

        FirstLine = FirstLine.replace(7,8, "равно");
        SecondLine = SecondLine.replace(7,8, "равно");
        ThirdLine = ThirdLine.replace(7,8, "равно");

        System.out.println(FirstLine);
        System.out.println(SecondLine);
        System.out.println(ThirdLine);
    }
}
