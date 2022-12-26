package behavioral.d_command.november10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Description: 使用springboot的工厂，实现ApplicationContextAware
 */
@Component
public class SpringUtil implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	// 重写set方法
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		if (SpringUtil.applicationContext == null) {
			SpringUtil.applicationContext = applicationContext;
		}
	}

	// 自定义getBean方法
	public static <E extends BaseDTO> Command<E> getBeanByName(String className, Class<E> eClass) {
		return (Command<E>) applicationContext.getBean(className);
	}

}
