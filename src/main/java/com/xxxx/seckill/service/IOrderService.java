package com.xxxx.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.seckill.pojo.Goods;
import com.xxxx.seckill.pojo.Order;
import com.xxxx.seckill.pojo.User;
import com.xxxx.seckill.vo.OrderDetailVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author muggle
 * @since 2021-07-29
 */
public interface IOrderService extends IService<Order> {

    Order seckill(User user, Goods goods);

    OrderDetailVo detail(Long orderId);
}
