package Patterns.Builder;

public class Main {

  public static void main(String[] args  ){
    StudentBuilder builder = Students.getStudentBuilder();
    builder.setAge(13).setName("Vikram")
      .setBatch("2022")
      .setGradYear(2022)
      .setId(993)
      .setPhoneNumber(90320323122L)
      .setUniversityName("KTU").build();


    Student2 student2 = Student2.getBuilder().setAge(13).setName("Vikram")
      .setBatch("2022")
      .setGradYear(2022)
      .setId(993)
      .setPhoneNumber(90320323122L)
      .setUniversityName("KTU").build();

      System.out.println("Buidler pattern done");
    
  }


}
