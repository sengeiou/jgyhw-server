package org.springblade.system.user.feign;

import org.springblade.core.tool.api.R;
import org.springblade.system.user.entity.WxUser;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign失败配置
 *
 * @author Chill
 */
@Component
public class IWxUserClientFallback implements IWxUserClient {

	/**
	 * 根据公众号标识获取微信用户
	 *
	 * @param openIdGzh 公众号标识
	 * @return
	 */
	@Override
	public R<WxUser> findWxUserByOpenIdGzh(@RequestParam("openIdGzh") String openIdGzh) {
		return R.fail(400,"未获取到微信用户信息");
	}
}
