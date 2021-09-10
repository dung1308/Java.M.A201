/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.main;

import java.util.ArrayList;
import fa.training.entities.Course;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class CourseManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Course> listAni = new ArrayList();
        Course course = new Course();
        CourseManagement repo = new CourseManagement();
        int choice;
        do{
            System.out.println("1.Create course");
            System.out.println("2.Search course");
            System.out.println("3.Display all");
            System.out.println("4.Quit!");
            choice =sc.nextInt();
            switch(choice){
                case 1:
                    course.input();
                    listAni.add(course);
                    break;
                case 2:
                    System.out.println("Name course:");
                    String searchName = sc.next();
                    for(Course x:listAni){
                        if(x.getName().equalsIgnoreCase(searchName)){
                            System.out.println(x);
                        }
                    }
                    break;
                case 3:
                    for(Course x:listAni){
                        System.out.println(x);
                    }
                    break;
            }
        }while(choice<4);
    }
}
