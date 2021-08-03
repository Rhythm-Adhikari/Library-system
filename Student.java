package Rhythm_5767441;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rrhythm
 */
public class Student extends User {
    private String Course;
    private String Degree;
    public Student(String course,String degree)
    {
        this.Course=course;
        this.Degree=degree;
    }
    public Student(String id,String uname,String fname,String lname,String course,String degree)
    {
       super(id,uname,fname,lname);
       this.Course=course;
       this.Degree=degree;
    }
    public Student(String id,String uname,String fname,String lname,String pass,String userType,String course,String degree)
    {
        super(id,uname,fname,lname,pass,userType);
        this.Course=course;
        this.Degree=degree;
    }
    public void setCourse(String course)
    {
        this.Course=course;
    }
    public void setDegree(String degree)
    {
        this.Degree=degree;
    }
    public String getCourse()
    {
        return this.Course;
    }
    public String getDegree()
    {
        return this.Degree;
    }
    @Override
    public String toString()
    {
      return super.toString()+" Course : "+Course+" Degree : "+Degree;
    }
    public Student clone()
    {
        return this.clone();
    }
}