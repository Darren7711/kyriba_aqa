public class aqa2 {
    public static void main(String[] args){
        //и или
        int age = 20;

        if (age < 18 || age > 65){
            System.out.println("кредит не дадим");
        } else {
            System.out.println("дадим кредит");
        }

        //switch case break
        String color = "red";
        switch (color){
            case "red":
            System.out.println("stop");
            break;
            case "yellow":
                System.out.println("warn");
                break;
            case "green":
                System.out.println("go");
                break;
            default:
                System.out.println("проверь что ты ввел");
                break;
        }

        //массивы
        String[] names = {"Рак", "Лысенко", "Стрельцова", "Орлеанская", "Бондаловский"};
        System.out.println(names[1]);
        int[] ages = {1,2,3,4,5};

        //циклы
        //while do
        int index = 4;
        String searchname = "Орлеанская";
        boolean isFound = false;
        while (index >= 0 && isFound == false){
            System.out.println(names[index]);
//            System.out.println("Лысенко");
            if (names[index] == searchname) {
                System.out.println("найдено по индексу " + index);
                isFound = true;
            }
            index--;
        }

        //do while
        do {
            System.out.println(names[index]);
            System.out.println("Бондаловский");
            if (names[index] == searchname) {
                System.out.println("найдено по индексу " + index);
                isFound = true;
            }
        } while (index >= 0 && isFound == false);

       //for
       for (int i = 3; i < names.length; i++) {
           System.out.println(names[i]);
       }

//       //for each
        for (String name:names){
            System.out.println(name);
        }
    }
}
