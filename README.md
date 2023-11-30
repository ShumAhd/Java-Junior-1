# Java Junior (семинары)
## Урок 1. Лямбды и Stream API.

### Задание
1. Создать список из 1_000 рандомных чисел от 1 до 1_000_000
2. Найти максимальное
3. Все числа, большие, чем 500_000, умножить на 5, отнять от них 150 и просуммировать
4. Найти количество чисел, квадрат которых меньше, чем 100_000

Код включает в себя четыре метода, каждый из которых использует лямбды и Stream API для обработки списка случайных чисел:

1. **`generateRandomNumbers()`**: Создает список из 1000 рандомных чисел от 1 до 1000000.

2. **`findMax(List<Integer> numbers)`**: Находит максимальное число в списке.

3. **`processNumbers(List<Integer> numbers)`**: Умножает на 5, отнимает 150 и суммирует числа, большие чем 500000.

4. **`countSquaresLessThan100000(List<Integer> numbers)`**: Находит количество чисел, квадрат которых меньше чем 100000.

### Результат в консоли
```agsl
Максимальное число: 999254

Результат операций: 1930631585

Количество чисел с квадратом меньше 100000: 0
```
