package Patterns.Prototype;

public class Main {
  public static void main( String[] args  ) {
    StudentRegistry  registry = new StudentRegistry();
    Student kvSept22Prototype = new Student();
    kvSept22Prototype.setBatch("sept22").setUniversityName("KV").setAvgBatchPsp(85.0);
    registry.register( BatachUniversity.KV_SEP22, kvSept22Prototype);

    IntelligentStudent studentIntelligent = new IntelligentStudent();
    studentIntelligent.setUniversityName("Harvard");
    studentIntelligent.setBatch("Dec25");
    studentIntelligent.setAvgBatchPsp((89.0));
    registry.register(BatachUniversity.HARVARD_DEC25, studentIntelligent);


    Student student1 = registry.getProtoype(BatachUniversity.KV_SEP22).copy();
    student1.setName("vikram").setAge(25).setGradYear(2021).setId(637283912326L);


    Student student2 = registry.getProtoype(BatachUniversity.HARVARD_DEC25).copy();
    student2.setName("Zohaib").setAge(25).setGradYear(2025).setId(3283728321217L);
    if( student2 instanceof IntelligentStudent ) {
      IntelligentStudent intelligentStudent = (IntelligentStudent) student2;
      intelligentStudent.steIq(120);
    }
  }
}
