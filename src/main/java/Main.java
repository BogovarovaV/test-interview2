import javafx.util.Pair;

public class Main {

    public static void main(String[] args) {
        Pair<String, String> book1 = new Pair<> ("Капитанская дочка", "Александр Сергеевич Пушкин");
        Pair<String, String> book2 = new Pair<> ("Война и Мир", "Лев Николаевич Толстой");
        Pair<String, String> book3 = new Pair<> ("Горе от ума", "Александр Сергеевич Грибоедов");

        Pair<String, String>[] books = new Pair[] {book1, book2, book3};

        for (int i = 0; i < books.length; i++){
            String name = books[i].getKey();
            String author = books[i].getValue();
            System.out.println("\"" + name + "\" " + author);
        }
    }
}
