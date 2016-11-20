package toolsLib;

import java.util.ResourceBundle;

/**
 * Created by Administrator on 2016-11-16.
 */
public class SeleniumConfig {
    private static ResourceBundle rb = ResourceBundle.getBundle("selenium");
    public final static String XamppURL = rb.getString("XamppURL");
    public final static String TaobaoURL = rb.getString("TaobaoURL");
    public final static String closeBrower = rb.getString("closeBrower");
    public final static String fireFoxPath = rb.getString("fireFoxPath");
    public final static String chormeDriver = rb.getString("chormeDriver");
    public  final  static  String fireFoxDriver=rb.getString("fireFoxDriver");


}
