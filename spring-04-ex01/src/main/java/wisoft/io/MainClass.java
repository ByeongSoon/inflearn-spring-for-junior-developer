package wisoft.io;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

  public static void main(String[] args){
    String configuration = "classpath:applicationCTX.xml";
    AbstractApplicationContext ctx = new GenericXmlApplicationContext(configuration);
    MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);

    myInfo.getInfo();

    ctx.close();
  }

}
