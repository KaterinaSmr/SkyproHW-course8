public class Person {
  private String name;
  private Integer yearOfBirth;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getYearOfBirth() {
    return yearOfBirth;
  }

  public void setYearOfBirth(int yearOfBirth) {
    if (yearOfBirth < 1900){
      throw new YearOfBirthException(this.name, yearOfBirth);
    }
    this.yearOfBirth = yearOfBirth;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", yearOfBirth=" + yearOfBirth +
            '}';
  }
}
