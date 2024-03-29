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
---
---

### Задание
1. Создать класс Employee (Сотрудник) с полями: String name, int age, double salary, String department
2. Создать список из 10-20 сотрудников
3. Вывести список всех различных отделов (department) по списку сотрудников
3. Всем сотрудникам, чья зарплата меньше 10_000, повысить зарплату на 20%
   
### Класс Employee

Класс `Employee` представляет собой сущность "Сотрудник" с полями: `name` (Имя), `age` (Возраст), `salary` (Зарплата), `department` (Отдел).

1. **`createEmployeeList()`**: Создает список из 20 сотрудников с разными параметрами.

2. **`printDistinctDepartments(List<Employee> employees)`**: Выводит список всех различных отделов (department) по списку сотрудников.

3. **`increaseSalary(List<Employee> employees)`**: Повышает зарплату на 20% всем сотрудникам, чья зарплата меньше 10_000.

### Результат в консоли
```agsl
Различные отделы: [HR, IT, Finance, Marketing]
John: 12000.0
Alice: 10800.0
Bob: 11000.0
Charlie: 11400.0
David: 10500.0
Emma: 11760.0
Frank: 14400.0
Grace: 10560.0
Henry: 11500.0
Ivy: 11040.0
Jack: 12240.0
Katherine: 15000.0
Leo: 10560.0
Mia: 11760.0
Nathan: 11200.0
Olivia: 10560.0
Peter: 14160.0
Quinn: 10800.0
Ryan: 13440.0
Sophia: 10800.0

```
