import java.util.regex.*;
import java.util.Scanner;
public class First_v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Дата: ");
        String text = in.nextLine();
        Pattern pattern = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");
        Pattern date = Pattern.compile("((^(0[1-9]|[12][0-9]|3[01])/(01|03|05|07|08|10|12)/(19\\d{2}|[2-9]\\d{3})$)|(^(0[1-9]|[12][0-9]|30)/(04|06|09|11)/(19\\d{2}|[2-9]\\d{3})$)|(^(0[1-9]|[12][0-9])/(02)/(19([02468][048]|[13579][26])|[2-9][0-9]([02468][048]|[13579][26]))$)|(^(0[1-9]|[12][0-8])/(02)/(19^([02468][048]|[13579][26])|[2-9][0-9]^([02468][048]|[13579][26]))$))");
        Matcher matcher = pattern.matcher(text);
        Matcher matcher_date = date.matcher(text);
        if (!matcher.matches()){
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
        }
        else {
            if (matcher_date.matches()){
                System.out.println("Введёное выражение является датой");
            }
            else{
                System.out.println("Введёное выражение не является датой");
            }
        }
    }
}