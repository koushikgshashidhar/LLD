package lld.designPattern.builder.v2;

import lld.designPattern.builder.v1.TargetV1;
import lld.designPattern.builder.v1.BuilderV1Parameter;

public class ClientV2 {

    public static void main(String[] args) {


        try {
            TargetV2 obj = TargetV2.getBuilder()
                    .setAttr1(2)
                    .setAttr2(3)
                    .setAttr3(4)
                    .setAttr4("asas")
                    .build();
            System.out.print("");
        }
        catch(Exception e) {
            System.out.println("Invalid Parameters:"+e);
        }


    }
}
