package lld.designPattern.builder.v1;

import java.security.InvalidParameterException;

public class TargetV1 {

    private int attr1;
    private int attr2;
    private int attr3;

    private String attr4;

    public TargetV1(BuilderV1Parameter dto) {

        if(dto.attr1<0 || dto.attr2<1 || dto.attr3<0 || dto.attr4==null)
            throw new InvalidParameterException("Invalid Input");

        this.attr1=dto.attr1;
        this.attr2= dto.attr2;
        this.attr3= dto.attr3;
        this.attr4= dto.attr4;
    }
}
