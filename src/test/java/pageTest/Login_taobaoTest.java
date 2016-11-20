package pageTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageLevel.TaoBaoLogin;
import toolsLib.readExcel;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Administrator on 2016-11-16.
 */
public class Login_taobaoTest {
    TaoBaoLogin p = new TaoBaoLogin();

    @DataProvider(name = "zhf")
    public Object[][] getData() throws IOException {
        readExcel read = new readExcel("login_data", 0);
        return read.getExcelData();
    }

    @Test(dataProvider = "zhf")
    public void login(HashMap<String, String> data) {
//        String username= NumberToString.numbertostring(data.get("user_name"));
        p.login(data.get("user_name"), data.get("user_password"));
        //    p.login(username,data.get("user_password"));
        //p.p.MoveTo(p.p.findElementBy_xpath("//span[.='我的淘宝']"));


    }
}
