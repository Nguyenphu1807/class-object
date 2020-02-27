/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author MyPC
 */
public class JavaApplication3 {
    public static void main(String[] args) {
        // TODO code application logic here
//        Student std = new Student("Paul","3.5");
//        System.out.println("Student : " + std.getName());
   Student student1= new Student("paul lee","3.5");
   Student student2= new Student("peter tan","3.9");
        System.out.println("name: " + student1.getName());
        System.out.println("Gpa :" + student1.getGpa());
        System.out.println("name: " + student2.getName());
        System.out.println("Gpa :" + student2.getGpa());
    }
    
}
