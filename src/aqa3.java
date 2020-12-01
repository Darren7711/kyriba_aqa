public class aqa3 {
    public static void main(String[] args) {
       int [] numbers = {1,2,3};
       // МАССИВЫ:
        // добавить - никак!!
        // заменить
        numbers[0] = 652;
        // получить
        System.out.println(numbers[1]);
        // удалить элемент
        numbers[2] = 0;
        // получить длину
        System.out.println(numbers.length);

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
            System.out.println("макс. число - "+max);
    }
}
