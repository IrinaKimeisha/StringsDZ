public class Main {
    public static void main(String[] args) {
        /**Написать программу со следующим функционалом: На вход передать строку (будем считать, что это номер документа).
         Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.

         1.1 Вывести на экран в одну строку два первых блока по 4 цифры.
         1.2 Вывести на экран номер документа, но буквы “a” заменить на * (каждая буква заменятся на *).
         1.3 Вывести на экран буквы из номера документа в формате "Letters:yyyyyyyy" в верхнем регистре
         1.4 Проверить содержит ли в номере документа последовательность abcd и
         вывести сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
         1.5 Проверить начинается ли номер документа с последовательности 5555.
         1.6 Проверить заканчивается ли номер документа на последовательность 1a2b.
         1.7 Вернуть номер документа в обратном виде(строку наоборот).

         Все эти методы реализовать в отдельном классе в методах, которые на вход (входным параметром)
         будут принимать вводимую на вход программы строку. В main вызвать эти методы.*/
        // "1234-asD-5678-iop-9b0m";
        DocsNumber a = new DocsNumber("1234-asD-5678-iop-9b0m");
        a.print1("1234-asD-5678-iop-9b0m");
        a.print2("1234-asD-5678-iop-9b0m");
        a.print3("1234-asD-5678-iop-9b0m");
        a.print4("1234-asD-5678-iop-9b0m");
        a.print5("1234-asD-5678-iop-9b0m");
        a.print6("1234-asD-5678-iop-9b0m");

        a.print8("1234-asD-5678-iop-9b0m");
    }
}