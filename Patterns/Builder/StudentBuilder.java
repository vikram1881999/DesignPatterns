package Patterns.Builder;

public class StudentBuilder {

  private String name;
  private int age;
  private double psp;
  private String universityName;
  private String batch;
  private long id;
  private int gradYear;
  private long phoneNumber;

  public String getName() {
    return name;
  }

  public StudentBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public int getAge() {
    return age;
  }

  public StudentBuilder setAge(int age) {
    this.age = age;
    return this;
  }

  public double getPsp() {
    return psp;
  }

  public StudentBuilder setPsp(double psp) {
    this.psp = psp;
    return this;
  }

  public String getUniversityName() {
    return universityName;
  }

  public StudentBuilder setUniversityName(String universityName) {
    this.universityName = universityName;
    return this;
  }

  public String getBatch() {
    return batch;
  }

  public StudentBuilder setBatch(String batch) {
    this.batch = batch;
    return this;
  }

  public long getId() {
    return id;
  }

  public StudentBuilder setId(long id) {
    this.id = id;
    return this;
  }

  public int getGradYear() {
    return gradYear;
  }

  public StudentBuilder setGradYear(int gradYear) {
    this.gradYear = gradYear;
    return this;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }

  public StudentBuilder setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  public Students build() {
    return new Students(this);
  }
}
