package com.company.Classes;

import com.company.Classes.Pupil;

public class GoodPupil extends Pupil {
    @Override
    public String Study() {
        return (super.Study() + "Good ");
    }

    @Override
    public String  Read() {
        return super.Read() + "Good ";
    }

    @Override
    public String Write() {
        return super.Write() + "Good ";
    }

    @Override
    public String Relax() {
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
