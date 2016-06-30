/**
 * Created by zhouzilong on 2016/6/27.
 */
class Person {
    public static void  main(String args[]){
        CallPerson cp = new CallPerson();
        cp.name = "zzl81cn";
        cp.say("zzl81cn");
        System.out.println("cp dot name is: " + cp.name);
    }
}

public class CallPerson{
    public int age;
    public String name;
    public void say(String content) {
        System.out.println("Test content is: " + content);
    }
}
