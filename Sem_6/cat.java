package Sem_6;

import java.util.ArrayList;
import java.util.List;

public class cat {

    // public static void main(String[] args) {
    // // System.out.println("bye world");
    // // String s = null; // определяется парой
    // // System.out.println(s); //определяется парой
    // // task0();
    // //task1(createArr(100, 0, 24));
    // // task0();(repeat (10, "TEST"));
    // Cat cat1 = new Cat( name: "Мурзик", owner: "Иван Петрович", breed: "Мейнкун",
    // age: 6);
    // }

    /*
     ** Текст задачи 2:**
     * 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
     * приложения,
     * которое является:
     * а) информационной системой ветеринарной клиники
     * б) архивом выставки котов
     * в) информационной системой Театра кошек Ю. Д. Куклачёва
     * Можно записать в текстовом виде, не обязательно реализовывать в java.
     */
    private String name;
    private String owner;
    private String breed;
    private Integer age;
    
    this.breed=breed;
    healthHistory=new ArrayList<>();
    // private List<String> healthHistory;


 @Override
    public String toString() {
        return "Имя : " + name + " Хозяин : " + owner + " Возраст : " + age + " Порода : " + breed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) obj;
        return age == cat.age && name.equals(cat.name) && owner.equals(cat.owner) && breed.equals(cat.breed);
    }

    @Override
    public int hashCode() {
        return 15 * name.hashCode() + 11 * owner.hashCode() + 3 * breed.hashCode() + 23 * age;
    }
}

// **Текст задачи:**
// 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
// использовать не все придуманные поля и методы. Создайте несколько экземпляров
// этого класса, выведите их в консоль.

// 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
// его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

// </aside> 21:22

// <aside>
// **Текст задачи:**

// 1. Создайте множество, в котором будут храниться экземпляры класса Cat -
// HashSet<Cat>. Поместите в него некоторое количество объектов.

// 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их
// во множество. Убедитесь, что все они сохранились во множество.

// 3. Создайте метод

// **public boolean**

// equals(Object o)

// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То
// есть, метод должен возвращать true, только если значения во всех полях
// сравниваемых объектов равны.

// 4. Создайте метод

// **public int hashCode()**

// который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно
// использовать Objects.hash(...))

// 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты
// удалились.

