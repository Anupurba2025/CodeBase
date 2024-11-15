package org.example;

import jakarta.persistence.Embeddable;

//If we don't want to create another new table,we are using @Embeddable Annotation.
//This AlienName has embedded inside the Alien Table.
@Embeddable
public class AlienName {
    private String fName;
    private String lName;
    private String mName;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Override
    public String toString() {
        return "AlienName{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", mName='" + mName + '\'' +
                '}';
    }
}
