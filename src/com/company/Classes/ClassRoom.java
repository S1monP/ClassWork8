package com.company.Classes;

public class ClassRoom {
Pupil pupil1;
Pupil pupil2;
Pupil pupil3;
Pupil pupil4;
Pupil pupil5;


public ClassRoom(String pupil1, String pupil2, String pupil3, String pupil4, String pupil5){
    this.pupil1 = new BadPupil(pupil1);
    this.pupil2 = new GoodPupil(pupil2);
    this.pupil3 = new BadPupil(pupil3);
    this.pupil4 = new ExcelentPupil(pupil4);
    this.pupil5 = new ExcelentPupil(pupil5);
    this.pupil6 = (Pupil) this.pupil5;
}
    Pupil pupil6;


    @Override
    public String toString() {
        return "Classroom: " + pupil1 + pupil2 + pupil3 + pupil4 + pupil6;
    }


}
