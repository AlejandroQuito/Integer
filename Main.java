public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        System.out.println(container.count);
        Integer number1 = 12345;

        System.out.println(sumDigits(number1));


    }

    public static Integer sumDigits(Integer number)
    {
        //@TODO: write code here
        int sum = 0;
        while (number != 0) {
            String newNumber1 = number.toString();
            newNumber1.length();
            System.out.println(newNumber1.length());
            int index = 0;
            for (int index1 = 0; index1 <= newNumber1.length(); index1++) {

            }
            Integer indexInt = index;

            String num = String.valueOf(newNumber1.charAt(index));
            Integer numInt = Integer.parseInt(num);
            sum = numInt;
            break;
        }
        return sum;
    }
}
