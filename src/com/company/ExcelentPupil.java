package com.company;

public class ExcelentPupil extends Pupil {
    @Override
    String Study() {
        return (super.Study() + "Excellent ");
    }

    @Override
    String  Read() {
        return super.Read() + "Excellent ";
    }

    @Override
    String Write() {
        return super.Write() + "Excellent ";
    }

    @Override
    String Relax() {
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
