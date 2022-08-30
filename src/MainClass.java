import java.util.Scanner;
import java.io.FileReader;

public class MainClass {

    public static void main(String[] args) {
        String greetings = """
                Здрасьте. Мы - конфигуратор вуза по конфигурационному файлу
                Дайте путь к конфигу
        """;
        System.out.print(greetings);
        Scanner consoleReader = new Scanner(System.in);
        String filePath = consoleReader.nextLine();

        try {
            FileReader configReader = new FileReader(filePath);
            //Здесь читаем файл в строковую переменную
            configReader.close();
        } catch (Exception e) {
            System.out.println("Введите правильный путь к конфигу");
        }

        // Вывод сгенеиррованной по конфигу структуры пользователю
    }
}

