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

}
