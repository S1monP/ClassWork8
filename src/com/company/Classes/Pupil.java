package com.company.Classes;

import com.company.Interfaces.IPupil;

public  abstract class Pupil implements IPupil {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pupil(String name){
        this.name = name;
    }
    public Pupil(){

    }

    public String Study(){
        return "Study-";
    }

    public String Read(){
        return "Read-";
    }
    public String Write(){
        return "Write-";
    }
    public String Relax(){
        return "Relax-";
    }

    @Override
    public String toString() {
        return '\n' + " name=" + name + '\n' + Study() + Read() + Write() + Relax();
    }
}
