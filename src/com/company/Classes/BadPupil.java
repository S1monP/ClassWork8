package com.company.Classes;

public class BadPupil extends Pupil {
    @Override
    public String Study() {
        return (super.Study() + "Bad ");
    }

    @Override
    public String  Read() {
        return super.Read() + "Bad ";
    }

    @Override
    public String Write() {
        return super.Write() + "Bad ";
    }

    @Override
    public String Relax() {
        return super.Relax() + "Good ";
    }
    public BadPupil()
    {
        super();
    }
    public BadPupil(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return super.toString();

    }
}
