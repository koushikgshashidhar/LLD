package lld.designPattern.builder.v2;

import java.security.InvalidParameterException;

public class TargetV2 {

    private int attr1;
    private int attr2;
    private int attr3;

    private String attr4;

    private TargetV2() {

    }
    public static TargetBuilderV2 getBuilder()
    {
        return new TargetBuilderV2();
    }

    public static class TargetBuilderV2 {

        /*
        1.Type checking
        2.Know all the parameter
        3.validate all the parameter
        4.create the object of Builder


         */
        private int attr1;
        private int attr2;
        private int attr3;

        private String attr4;

        public TargetBuilderV2 setAttr1(int attr1) {
            this.attr1 = attr1;
            return this;
        }

        public TargetBuilderV2 setAttr2(int attr2) {
            this.attr2 = attr2;
            return this;
        }

        public TargetBuilderV2 setAttr3(int attr3) {
            this.attr3 = attr3;
            return this;
        }

        public TargetBuilderV2 setAttr4(String attr4) {
            this.attr4 = attr4;
            return this;
        }

        public TargetV2 build() {

            //Validate
            if (attr1 < 0 || attr2 < 1 || attr3 < 0 || attr4 == null)
                throw new InvalidParameterException("Invalid Input");

            //Build
            TargetV2 obj = new TargetV2();
            obj.attr1=attr1;
            obj.attr2=attr2;
            obj.attr3=attr3;
            obj.attr4= attr4;

            return obj;
        }
    }


}
