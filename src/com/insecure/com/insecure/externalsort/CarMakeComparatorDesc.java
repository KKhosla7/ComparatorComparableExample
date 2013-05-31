package com.insecure.com.insecure.externalsort;

import com.insecure.CarMake;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: Karan Khosla
 * Date: 5/31/13
 * Time: 7:07 PM
 */

public class CarMakeComparatorDesc extends CarMake implements Comparator<CarMake> {

    /**
     * @param o1 - CarMake Object 1
     * @param o2 - CarMake Object 2
     */
    @Override
    public int compare(CarMake o1, CarMake o2) {
        if(o1.getYear() > o2.getYear()) {
            return -1;
        }
        else if(o1.getYear() < o2.getYear()) {
            return 1;
        }
        return 0;
    }

}