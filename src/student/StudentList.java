/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author brand
 */
public class StudentList {
    
    public static void main(String[] args){
        //Student s1 = new Student("s1", "ronak");
        Student[] StudentList = new Student[6];
        StudentList[0]=new Student("s1", "ronak");
        StudentList[1]=new Student("s2", "abc");
        StudentList[2]=new Student("s3", "xyz");
        StudentList[3]=new Student("s4", "xyz1");
        StudentList[4]=new Student("s5", "xyz2");
        StudentList[5]=new Student("s6", "xyz3");
        
        for(int i = 0; i < StudentList.length; i++)
        {
            System.out.println(StudentList[i]. getStudentName());
        }
        
    }
    
}
