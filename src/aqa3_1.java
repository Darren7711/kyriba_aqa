import java.util.ArrayList;
import java.util.List;

public class aqa3_1 {
    public static void main(String[] args) {
        //FIFO
        //FILO
        //LIFO
        //LILO
        List<String> surnames = new ArrayList<>();
        //добавить
        surnames.add("Рак");
        //изменить
        surnames.add(0, "Стрельцова");
        System.out.println(surnames);
        //удалить
        surnames.remove(0);
//        surnames.remove("Рак");
        System.out.println(surnames);
        //получение
        System.out.println(surnames.get(0));
        //размер
        System.out.println(surnames.size());
        //найти строку в коллекции, которая имеет наиб. длину
        List<String> strings = new ArrayList<>();
        strings.add("bla");
        strings.add("blablabla");
        strings.add("blabla");

        int max = strings.get(0).length();
            for (String str : strings){
                if (max < str.length()){
                    max = str.length();
                }
        }
        System.out.println("макс. длина строки в коллекции - "+max);
    }
}
