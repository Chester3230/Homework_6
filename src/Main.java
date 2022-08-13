import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задание 1


        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);


        // Задание 2


        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());


        // Задание 3


        fullName = "Иванов Семён Семёнович";
        String[] arrayName = fullName.split(" ");
        String replace = "";
        for (int i = 0; i < arrayName.length; ++i){
            if(arrayName[i].contains("ё")){
                String[] subString = arrayName[i].split("ё");
                for (int ii = 0; ii < subString.length - 1; ++ii){
                    replace = replace + subString[ii] + "е";
                }
                replace = replace + subString[subString.length - 1] + " ";
            } else {
                replace = replace + " " + arrayName[i] + " ";
            }
        }
        System.out.println("Данные ФИО сотрудника -"+ replace);
    }
}