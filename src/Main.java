public class Main {

  //Напишите пример перехвата и обработки исключения с использованием собственных исключений

  public static void main(String[] args) {
    Person person = new Person("Ivan");

    try {
      person.setYearOfBirth(1800);
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println(person);
  }
}