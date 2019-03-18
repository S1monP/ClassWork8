package com.company;

public class GoodPupil extends Pupil {
    @Override
    String Study() {
        return (super.Study() + "Good ");
    }

    @Override
    String  Read() {
        return super.Read() + "Good ";
    }

    @Override
    String Write() {
        return super.Write() + "Good ";
    }

    @Override
    String Relax() {
        return super.Relax() + "Good ";
    }
    public GoodPupil()
    {
        super();
    }
    public GoodPupil(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return super.toString();

    }
}
