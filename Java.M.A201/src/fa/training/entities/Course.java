/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.entities;

import java.util.Scanner;
import fa.training.utils.Validator;
/**
 *
 * @author ASUS
 */
public class Course {
    private String id;
    private String name;
    private double duration;
    private String status;
    private String flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Course(){
        this.id = null;
        this.name = null;
        this.duration = 0;
        this.status = null;
        this.flag = null;
    }
    
    public Course(String id, String name, double duration, String status, String flag) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.status = status;
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Id: "+this.id+", name: "+this.name+", duration: "+this.duration+
                ", status: "+this.status+", flag: "+this.flag; //To change body of generated methods, choose Tools | Templates.
    }
    public void input(){
        Validator valid = new Validator();
        Scanner sc = new Scanner(System.in);
        boolean checkId = false;
        System.out.println("Id:");
        do{
            try{
                this.id = sc.nextLine();
                if(valid.validId(id)){
                    checkId = true;
                }
                else{
                    System.out.println("Invalid(Start woth SW(5 characters)");
                }
            }catch(Exception e){
                System.out.println("Error, try again!");
            }
        }while(checkId == false);
        boolean checkName = false;
        System.out.println("Name: ");
        do{
            try{
                this.name = sc.nextLine();
                checkName = true;
            }catch(Exception e){
                System.out.println("Error, try again!");
            }
        }while(checkName == false);
        boolean checkDuration = false;
        System.out.println("Duration: ");
        do{
            try{
                double duration = sc.nextDouble();
                this.duration = duration;
                checkDuration = true;
            }catch(NumberFormatException e){
                System.out.println("Error, try again!");
            }
        }while(checkDuration == false);
        boolean checkStatus=false;
        System.out.println("Status (active/in-active): ");
        do{
            try{
                this.status = sc.nextLine();
                if(valid.validStatus(status) == true){
                    checkStatus = true;
                }
                else{
                    System.out.println("Invalid");
                }
            }catch(Exception e){
                System.out.println("Error, try again!");
            }
        }while(checkStatus == false);
        boolean checkFlag = false;
        System.out.println("Flag (optional/mandatory/'N/A')");
        do{
            try{
                this.flag = sc.nextLine();
                if(valid.validFlag(flag)){
                    checkFlag = true;
                }else{
                    System.out.println("Invalid");
                }
            }catch(Exception e){
                System.out.println("Error, try again!");
            }
        }while(checkFlag == false);
    }
}
