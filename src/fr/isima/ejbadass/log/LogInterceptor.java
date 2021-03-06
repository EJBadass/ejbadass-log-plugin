package fr.isima.ejbadass.log;

import java.lang.reflect.Method;

import fr.isima.ejbadass.annotation.Inject;
import fr.isima.ejbadass.plugable.IInterceptor;

public class LogInterceptor implements IInterceptor {

	@Inject
	ILogger logger;
	
	private IInterceptor next;

	@Override
	public Object proceed(Object object, Method method, Object[] args) throws Exception {
		
		logger.log(method.getName());
		Object result = next().proceed(object, method, args);
		logger.log(method.getName());
		
		return result;
	}

	@Override
	public IInterceptor next() {
		return this.next;
	}

	@Override
	public void setNext(IInterceptor next) {
		this.next = next;
	}

}
