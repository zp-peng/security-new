/**
 * 
 */
package com.imooc.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**访问的服务需要身份认证，请引导用户到登录页
 * 校验码生成器
 * @author zhailiang
 *
 */
public interface ValidateCodeGenerator {

	/**
	 * 生成校验码
	 * @param request
	 * @return
	 */
	ValidateCode generate(ServletWebRequest request);
	
}
