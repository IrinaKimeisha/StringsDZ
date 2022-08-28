public class DocsNumber {
    String a;


    public DocsNumber(String a) {
        this.a = a;
    }

    // 1.1 Вывести на экран в одну строку два первых блока по 4 цифры.
    public void print1(String a) {
        System.out.println(a.substring(0, 4) + " " + a.substring(9, 13)); //1.1
    }

    // 1.2 Вывести на экран номер документа, но буквы “a” заменить на * (каждая буква заменятся на *).
    public void print2(String a) {
        System.out.println(a.replace("a", "*")); //1.2
    }

    // 1.3 Вывести на экран буквы из номера документа в формате "Letters:yyyyyyyy" в верхнем регистре
    public void print3(String a) {
        System.out.println("Letters:" + a.toUpperCase().substring(5, 8) + a.toUpperCase().substring(14, 17) + a.toUpperCase().charAt(19) + a.toUpperCase().charAt(21));
    }

    /* 1.4 Проверить содержит ли в номере документа последовательность abcd и вывести сообщение содержит или нет
    (причем, abc и ABC считается одинаковой последовательностью). */
    public void print4(String a) {
        if (a.contains("abcd")) {
            System.out.println("Последовательность abcd содержится");
        } else {
            System.out.println("Последовательность abcd не содержится");
        }
    }

    // 1.5 Проверить начинается ли номер документа с последовательности 5555.
    public void print5(String a) {
        if (a.startsWith("5555")) {
            System.out.println("Номер документа начинается с последовательности 5555");
        } else {
            System.out.println("Номер документа не начинается с 5555");
        }
    }

    // 1.6 Проверить заканчивается ли номер документа на последовательность 1a2b.
    public void print6(String a) {
        if (a.endsWith("1a2b")) {
            System.out.println("Номер документа заканчивается на 1a2b");
        } else {
            System.out.println("Номер документа не заканчивается на 1a2b");
        }
    }
    String v = new StringBuilder("1234-asD-5678-iop-9b0m").reverse().toString();
    public  void print8(String a){
        System.out.println(v);}

}
