import java.io.*;
import java.util.*;
import org.jdom.*;
import org.jdom.input.*;

public class testXMLRead {
    public static void main(String arge[]) {
        long lasting = System.currentTimeMillis();
        try {
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build("E:\\Java_Code\\spring\\Spring_0100_AbstractOrientedProgramming\\src\\test.xml");
            Element foo = doc.getRootElement();
            List allChildren = foo.getChildren();
            for (int i = 0; i < allChildren.size(); i++) {
                System.out.print("车牌号码:"+ ((Element) allChildren.get(i)).getChild("NO").getText());
                System.out.println("车主地址:"+ ((Element) allChildren.get(i)).getChild("ADDR").getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}