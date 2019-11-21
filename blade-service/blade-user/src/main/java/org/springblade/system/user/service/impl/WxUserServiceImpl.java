/**
 * Copyright (c) 2018-2028, Chill Zhuang 庄骞 (smallchill@163.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springblade.system.user.service.impl;


import org.springblade.core.mp.base.BaseServiceImpl;
import org.springblade.system.user.entity.WxUser;
import org.springblade.system.user.mapper.WxUserMapper;
import org.springblade.system.user.service.IWxUserService;
import org.springframework.stereotype.Service;

/**
 * 微信用户服务实现类
 *
 * Created by WangLei on 2019/11/19 0019 19:26
 */
@Service
public class WxUserServiceImpl extends BaseServiceImpl<WxUserMapper, WxUser> implements IWxUserService {

}