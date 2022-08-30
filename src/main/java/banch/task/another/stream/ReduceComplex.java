package banch.task.another.stream;

import java.util.stream.Stream;

public class ReduceComplex {

    public static void main(String[] args) {

        // найти сумму цен тех телефонов, у которых цена меньше определенного значения.
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000),
                new Phone("LG G 4", 32000));

        /**
         * В качестве первого параметра идет значение по умолчанию - 0.
         * Второй параметр производит бинарную операцию, которая получает
         * промежуточное значение - суммарную цену текущего и предыдущего телефонов.
         * Третий параметр представляет бинарную операцию, которая
         * суммирует все промежуточные вычисления.
         */
        int sum = phoneStream.reduce(0,
                (x,y)-> {
                    if(y.getPrice()<50000)
                        return x + y.getPrice();
                    else
                        return x + 0;
                },
                (x, y)->x+y);

        System.out.println(sum); // 117000
    }
}


class Phone{

    private String name;
    private int price;

    public Phone(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
