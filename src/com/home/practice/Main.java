package com.home.practice;
import com.home.practice.package1.*;
import com.home.practice.package2.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
       /* Parent parent = new FirstGrandChild();
        parent.go();
        parent.func();*/

       // Parent1 par = new FirstChild1();
        //par.go();

        /*ABC abc = new ABCImpl();
        abc.someImplMethod();
        abc.someMethod();*/
        //String[] str = {"s","u"};
        //ABC.main(str);

        XYZ x = new XYZImpl();
        String[] str = {"s","u"};
        XYZ.main(str);

    }
}
