/**
 * Created by zhouzilong on 2016/6/27.
 */
public class ReturnThis {
    public int age;
    public ReturnThis grow(){
        age++;
        return this;
    }
    public static void main(String args[]){
        ReturnThis rt = new ReturnThis();
        rt.grow().grow().grow();
        System.out.print(rt.age);
    }
}
