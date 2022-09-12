public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1:");
        byte age1 = 10;
        if (age1 >= 18) {System.out.println("Поздравляем, ты совершеннолетний!");}
        if (age1 < 18)  {System.out.println("Тебе надо еще подрасти");}

        // Задание 2
        System.out.println("Задание 2:");
        byte ageChild1 = 30;
        if (ageChild1 < 18 &&  ageChild1 >= 7) {System.out.println("Здравствуй школа!");}
        if (ageChild1 < 24 &&  ageChild1 > 18) {System.out.println("Вставай, тебе к первой паре!");}
        if (ageChild1>=24) {System.out.println("Работа не walk, работа work, так что в лес не убежала, еще можно найти!");}

        // Задание 3
        System.out.println("Задание 3:");
        byte capacity1 = 102;
        if (capacity1<=60) {System.out.println("Еще есть сидячие места!");}
        if (capacity1>60 && capacity1<102) {System.out.println("Стоя, но я доеду");}
        if (capacity1>=102) System.out.println("Мест нет");

    }
}