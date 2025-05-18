package Patterns.Builder;

public class Students {

  private String name;
  private int age;
  private double psp;
  private String universityName;
  private String batch;
  private long id;
  private int gradYear;
  private long phoneNumber;


  public Students( StudentBuilder studentBuilder  ){
    // Validations
    if( studentBuilder.getGradYear()  > 2025 ) {
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

  public static StudentBuilder getStudentBuilder() {
    return new StudentBuilder();
  }
  
}
