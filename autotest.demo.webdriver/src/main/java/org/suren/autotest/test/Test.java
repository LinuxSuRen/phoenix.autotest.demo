/**
 * http://surenpi.com
*/
package org.suren.autotest.test;

import java.io.IOException;

import com.surenpi.autotest.utils.ThreadUtil;
import org.openqa.selenium.WebDriver;
import org.suren.autotest.web.framework.annotation.AutoApplication;
import org.suren.autotest.web.framework.settings.Phoenix;

/**
 * AutoTest框架的一个简单示例</br>
 * @author suren
 * @date 2016年12月13日 下午7:52:06
 */
@AutoApplication
public class Test
{

	/**
	 * 入口函数
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		Phoenix phoenix = new Phoenix(Test.class);
		phoenix.init();
		
		WebDriver driver = phoenix.getEngine().getDriver();
		driver.get("http://baidu.com");
		
		ThreadUtil.silentSleep(3000);
		
		phoenix.close(); //关闭框架
	}

}
