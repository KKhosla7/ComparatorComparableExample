package com.insecure;

import com.insecure.com.insecure.externalsort.CarMakeComparatorAsc;
import com.insecure.com.insecure.externalsort.CarMakeComparatorDesc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Karan Khosla
 * Date: 5/31/13
 * Time: 7:10 PM
 */

public class CarMakeSortTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<CarMake> carYear = new ArrayList<CarMake>();
        populateData(carYear);

        // carYear Copy - ArrayList Copy

        List<CarMake> carYear1 = new ArrayList<CarMake>(carYear);

        System.out.println("[Untouched] Original Car Year:\t\t\t" + carYear);


        // Internal Sorting -CarMake

        Collections.sort(carYear);
        System.out.println("[Internal Sort] Car Sort By Year Asc..: " + carYear);


        // External Sorting - CarMake

        Collections.sort(carYear1, new CarMakeComparatorAsc());
        System.out.println("[External Sort] Car Sort By Year Asc..: " + carYear1);

        Collections.sort(carYear1, new CarMakeComparatorDesc());
        System.out.println("[External Sort] Car Sort By Year Desc.: " + carYear1);
    }

    /**
     * @param srcList
     */
    private static void populateData(List<CarMake> srcList) {
        srcList.add(new CarMake(2000));
        srcList.add(new CarMake(1988));
        srcList.add(new CarMake(1987));
        srcList.add(new CarMake(2012));
    }

}