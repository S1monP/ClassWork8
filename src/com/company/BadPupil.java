package com.company;

public class BadPupil extends Pupil{
    @Override
    String Study() {
        return (super.Study() + "Bad ");
    }

    @Override
    String  Read() {
        return super.Read() + "Bad ";
    }

    @Override
    String Write() {
        return super.Write() + "Bad ";
    }

    @Override
    String Relax() {
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
