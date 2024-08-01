package com.systecloud.certification.classtype;

public class StandardInheritanceClass extends StandardClass {
    public void validateInnerClass2() {
        InnerClass2 innerClass2 = new InnerClass2();
        innerClass2.process();
    }

    public void validateInnerClass4() {
        InnerClass4 innerClass4 = new InnerClass4();
        innerClass4.process();
    }
}
