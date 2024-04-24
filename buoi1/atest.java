import org.junit.*;

public class atest {
    @Test 
    public void test(){
        a A = new a();
        Assert.assertEquals("Hello", A.say());
    }
}
