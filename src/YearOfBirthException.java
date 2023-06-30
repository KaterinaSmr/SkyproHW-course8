public class YearOfBirthException extends RuntimeException{
  public YearOfBirthException(String name, int year) {
    super("Year of birth cannot be less than 1900! for " + name + ", " + year);
  }
}
