package Patterns.Prototype;

public class Student implements StduentPrototype<Student> {
  private String name;
  private int age;
  private double avgBatchPsp;
  private String universityName;
  private String batch;
  private long id;
  private int gradYear;
  private long phoneNumber;

  public Student(){}

  protected Student( Student student ) {
    super();
    this.name = student.name;
    this.age = student.age;
    this.id = student.id;
    this.gradYear = student.gradYear;
    this.phoneNumber = student.phoneNumber;
  }

  public Student setAvgBatchPsp( double psp) {
    this.avgBatchPsp = psp;
    return this;
  }

  public double getAvgBatchPsp() {
    return avgBatchPsp;
  }

  
  public String getName() {
    return name;
  }

  public Student setName(String name) {
    this.name = name;
    return this;
  }

  public int getAge() {
    return age;
  }

  public Student setAge(int age) {
    this.age = age;
    return this;
  }

  public String getUniversityName() {
    return universityName;
  }

  public Student setUniversityName(String universityName) {
    this.universityName = universityName;
    return this;
  }

  public String getBatch() {
    return batch;
  }

  public Student setBatch(String batch) {
    this.batch = batch;
    return this;
  }

  public long getId() {
    return id;
  }

  public Student setId(long id) {
    this.id = id;
    return this;
  }

  public int getGradYear() {
    return gradYear;
  }

  public Student setGradYear(int gradYear) {
    this.gradYear = gradYear;
    return this;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }

  public Student setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  @Override
  public Student copy() {
    Student student = new Student(this);
    return student;
  }

}
