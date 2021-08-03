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
public enum UserType{
    Student ("st"), 
    GeneralStaff ("gs"), 
    AdminStaff ("af"), 
    AcademicStaff ("as"),
    Librarian ("l")
    ; 
    private final String shortCode;
        
    UserType(String code) {
        this.shortCode = code;
    }
        
    public String getDirectionCode() {
        return this.shortCode;
    }
  }