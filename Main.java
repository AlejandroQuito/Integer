public class Main
{
    public static void main(String[] args)
    {

        Integer number1 = 12345;
        Integer number2 = 10;
        Integer number3 = 5059191;
        System.out.println("Сумма цифр равна:   " + sumDigits(number1));
        System.out.println("Сумма цифр равна:   " + sumDigits(number2));
        System.out.println("Сумма цифр равна:   " + sumDigits(number3));

    }

    public static Integer sumDigits(Integer number)
    {
        //@TODO: write code here
        int sum = 0;
        while (number != 0)
        {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
