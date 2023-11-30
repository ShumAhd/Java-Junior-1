import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamExample {

  /**
   * Создает список из 1000 рандомных чисел от 1 до 1000000.
   *
   * @return Список из 1000 рандомных чисел.
   */
  public static List<Integer> generateRandomNumbers() {
    Random random = new Random();
    return random.ints(1000, 1, 1000001)
        .boxed()
        .collect(Collectors.toList());
  }
  /**
   * Находит максимальное число в списке.
   *
   * @param numbers Список чисел.
   * @return Максимальное число.
   */
  public static int findMax(List<Integer> numbers) {
    return numbers.stream()
        .max(Integer::compareTo)
        .orElseThrow(() -> new IllegalStateException("Список пуст"));
  }
  /**
   * Умножает на 5, отнимает 150 и суммирует числа, большие чем 500000.
   *
   * @param numbers Список чисел.
   * @return Результат вычислений.
   */
  public static int processNumbers(List<Integer> numbers) {
    return numbers.stream()
        .filter(num -> num > 500000)
        .mapToInt(num -> num * 5 - 150)
        .sum();
  }
  /**
   * Находит количество чисел, квадрат которых меньше чем 100000.
   *
   * @param numbers Список чисел.
   * @return Количество чисел, удовлетворяющих условию.
   */
  public static long countSquaresLessThan100000(List<Integer> numbers) {
    return numbers.stream()
        .filter(num -> Math.pow(num, 2) < 100000)
        .count();
  }
  public static void main(String[] args) {
    // Генерация списка рандомных чисел
    List<Integer> randomNumbers = generateRandomNumbers();

    // Нахождение максимального числа
    int maxNumber = findMax(randomNumbers);
    System.out.println("Максимальное число: " + maxNumber);

    // Выполнение операций с числами, большими чем 500000
    int result = processNumbers(randomNumbers);
    System.out.println("Результат операций: " + result);

    // Нахождение количества чисел, квадрат которых меньше чем 100000
    long count = countSquaresLessThan100000(randomNumbers);
    System.out.println("Количество чисел с квадратом меньше 100000: " + count);
  }

}
