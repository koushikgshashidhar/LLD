package lld.designPattern.builder.v1;

public class ClientV1 {

    public static void main(String[] args) {

        BuilderV1Parameter dto = new BuilderV1Parameter();
        dto.attr1 = -1;
        dto.attr2 = 1;
        dto.attr3 = 4;

        try {
            TargetV1 obj = new TargetV1(dto);
        }
        catch(Exception e) {
            System.out.println("Invalid Parameters:"+e);
        }


    }
}
