package com.systecloud.certification.classtype;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class StandardClass {
    private String value;

    @Getter
    public class InnerClass1 {
        private String version;

        public void process() {
            log.info("public class InnerClass1");
        }
    }

    @Getter
    protected class InnerClass2 {
        private String version;

        public void process() {
            log.info("protected class InnerClass2");
        }
    }

    @Getter
    private class InnerClass3 {
        private String version;

        public void process() {
            log.info("private class InnerClass3");
        }
    }

    @Getter
    class InnerClass4 {
        private String version;

        public void process() {
            log.info("class InnerClass4");
        }
    }

    public void validateInnerClass3() {
        InnerClass3 innerClass = new InnerClass3();
        innerClass.version = "1.0.0";
        innerClass.process();
        log.info("Atributo privado de una clase interna si puede ser accedido desde un metódo de la clase externa, a pesar de que la clase interna sea privada: {}",
                innerClass.getVersion());
    }

}
