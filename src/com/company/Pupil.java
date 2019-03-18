package com.company;

public class Pupil {
    String name;

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
    String Study(){
        return "Study-";
    }
    String Read(){
        return "Read-";
    }
    String Write(){
        return "Write-";
    }
    String Relax(){
        return "Relax-";
    }

    @Override
    public String toString() {
        return '\n' + " name=" + name + '\n' + Study() + Read() + Write() + Relax();
    }
}
