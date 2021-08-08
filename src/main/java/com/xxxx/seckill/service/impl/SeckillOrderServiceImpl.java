package com.xxxx.seckill.service.impl;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxxx.seckill.pojo.SeckillOrder;
import com.xxxx.seckill.pojo.User;
import com.xxxx.seckill.service.ISeckillOrderService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

@Service
public class SeckillOrderServiceImpl implements ISeckillOrderService{
    @Override
    public Long getResult(User user, Long goodsId) {
        return null;
    }

    @Override
    public boolean saveBatch(Collection<SeckillOrder> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<SeckillOrder> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<SeckillOrder> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(SeckillOrder entity) {
        return false;
    }

    @Override
    public SeckillOrder getOne(Wrapper<SeckillOrder> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<SeckillOrder> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<SeckillOrder> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<SeckillOrder> getBaseMapper() {
        return null;
    }
}