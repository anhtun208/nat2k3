/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Manage_Author;

/**
 *
 * @author Admin
 */
public class ManageAuthor {
    private int CMND;
    private String first_name,last_name,about,filed_of_Expertise;

    public ManageAuthor(int _CMND, String _first_name, String _last_name, String _about, String _Expertise) {
        this.CMND = _CMND;
        this.first_name = _first_name;
        this.last_name = _last_name;
        this.about = _about;
        this.filed_of_Expertise = _Expertise;
    }
    
    
   
    

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getFiled_of_Expertise() {
        return filed_of_Expertise;
    }

    public void setFiled_of_Expertise(String filed_of_Expertise) {
        this.filed_of_Expertise = filed_of_Expertise;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
