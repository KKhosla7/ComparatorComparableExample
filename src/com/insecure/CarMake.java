package com.insecure;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Karan Khosla
 * Date: 5/31/13
 * Time: 7:02 PM
 */

public class CarMake implements Comparable<CarMake> {

    protected Integer year;

    public CarMake() {
        // No Implementaion Required.
    }

    public CarMake(int year) {
        this.year = year;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Overridden toString Method of Object Class
     */
    @Override
    public String toString() {
        return "" + year;
    }


    /**
     * Overridden compareTo Method of Comparable Interface
     *  @param o - CarMake Object
     */
    @Override
    public int compareTo(CarMake o) {
        if(o.getYear() > this.getYear()) {
            return -1;
        }
        else if(o.getYear() < this.getYear()) {
            return 1;
        }
        return 0;
    }

    @Override
    public int hashCode() {
        int yearValue = year;
        yearValue ^= 17;
        yearValue ^= yearValue >>> 31;
        return yearValue;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj != null && getClass() == obj.getClass()) {
            CarMake carMake = (CarMake) obj;
            if(this.getYear() == carMake.getYear())
                return true;
        }
        return false;
    }
}