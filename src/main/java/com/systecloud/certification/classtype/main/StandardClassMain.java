package com.systecloud.certification.classtype.main;

import com.systecloud.certification.classtype.StandardClass;
import com.systecloud.certification.classtype.StandardInheritanceClass;
import com.systecloud.certification.classtype.StandardClass.InnerClass1;

public class StandardClassMain {
    public static void main(String[] args) {
        StandardClass standard = new StandardClass();

        InnerClass1 innerClass1 = standard.new InnerClass1();
        innerClass1.process();
       
        StandardInheritanceClass standardInheritance = new StandardInheritanceClass();
        standardInheritance.validateInnerClass2();

        standard.validateInnerClass3();

        standardInheritance.validateInnerClass4();

    }
}
