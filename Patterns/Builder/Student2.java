package Patterns.Builder;

public class Student2 {

  private String name;
  private int age;
  private double psp;
  private String universityName;
  private String batch;
  private long id;
  private int gradYear;
  private long phoneNumber;

  private Student2(){}

  private Student2(Student2Builder studentBuilder) {
    // Validations
    if (studentBuilder.getGradYear() > 2025) {
      throw new IllegalArgumentException("Grad Year cannot be greater than 2025");
    }

    this.age = studentBuilder.getAge();
    this.name = studentBuilder.getName();
    this.psp = studentBuilder.getPsp();
    this.universityName = studentBuilder.getUniversityName();
    this.batch = studentBuilder.getBatch();
    this.id = studentBuilder.getId();
    this.gradYear = studentBuilder.getGradYear();
    this.phoneNumber = studentBuilder.getPhoneNumber();
  }

  public static Student2Builder getBuilder() {
    return new Student2Builder();
  }

  static class Student2Builder {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private long id;
    private int gradYear;
    private long phoneNumber;

    private Student2Builder(){}

    public String getName() {
      return name;
    }

    public Student2Builder setName(String name) {
      this.name = name;
      return this;
    }

    public int getAge() {
      return age;
    }

    public Student2Builder setAge(int age) {
      this.age = age;
      return this;
    }

    public double getPsp() {
      return psp;
    }

    public Student2Builder setPsp(double psp) {
      this.psp = psp;
      return this;
    }

    public String getUniversityName() {
      return universityName;
    }

    public Student2Builder setUniversityName(String universityName) {
      this.universityName = universityName;
      return this;
    }

    public String getBatch() {
      return batch;
    }

    public Student2Builder setBatch(String batch) {
      this.batch = batch;
      return this;
    }

    public long getId() {
      return id;
    }

    public Student2Builder setId(long id) {
      this.id = id;
      return this;
    }

    public int getGradYear() {
      return gradYear;
    }

    public Student2Builder setGradYear(int gradYear) {
      this.gradYear = gradYear;
      return this;
    }

    public long getPhoneNumber() {
      return phoneNumber;
    }

    public Student2Builder setPhoneNumber(long phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public Student2 build() {
      return new Student2(this);
    }

  }

}
