package lld.designPattern.singleton;

public class SingletonV2 {

    private static SingletonV2 instance=null;

    private SingletonV2()
    {

    }


    public synchronized static SingletonV2 getInstance()
    {
        if(instance==null)
        instance= new SingletonV2();

        return instance;

    }
}
