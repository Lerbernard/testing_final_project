import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class post {
    @BeforeClass
    void  login(){
        login login = new login();
        login.login_site();

    }

    @Test
    void tet_1(){
        System.out.println("testworkedd");
    }
}

