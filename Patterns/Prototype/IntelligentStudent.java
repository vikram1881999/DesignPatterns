package Patterns.Prototype;

public class IntelligentStudent extends Student  {

  private int iq;

  public IntelligentStudent steIq( int iq) {
    this.iq = iq;
    return this;
  }


  public IntelligentStudent() {
    super();
  }

  private IntelligentStudent( IntelligentStudent student ) {
    super(student);
    this.iq = student.iq;
  }

  @Override
  public IntelligentStudent copy() {
    IntelligentStudent student = new IntelligentStudent( this );
    return student;
  }
  
}
