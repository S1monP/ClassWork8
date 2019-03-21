package com.company.Classes;

import com.company.Classes.Pupil;

public class ExcelentPupil extends Pupil {
    @Override
    public String Study() {
        return (super.Study() + "Excellent ");
    }

    @Override
    public String  Read() {
        return super.Read() + "Excellent ";
    }

    @Override
    public String Write() {
        return super.Write() + "Excellent ";
    }

    @Override
    public String Relax() {
        return super.Relax() + "Bad ";
    }
    public ExcelentPupil()
    {
        super();
    }
    public ExcelentPupil(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return super.toString();

    }
}
