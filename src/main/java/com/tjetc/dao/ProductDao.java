package com.tjetc.dao;


import com.tjetc.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {
    //新增商品
    Product insertProduct(Product product) throws SQLException;
    //根据商品id-删除商品
    boolean deleteById(String id) throws SQLException;
    //根据商品id修改商品价格
    boolean updateByIdAndPrice(String id,int price) throws SQLException;
    //修改商品信息
    boolean updatePrice(Product product) throws SQLException;
    //根据商品id查询商品
    Product selectById(String pid) throws SQLException;
    //根据商品名称查询商品
    List<Product> selectByName(String pname) throws SQLException;
    //根据商品类别查询商品
    List<Product> selectByType(String ptype) throws SQLException;
    //根据商品名模糊查询商品
    List<Product> selectByLikeName(String name) throws SQLException;
    //查询所有商品信息
    List<Product> selectProduct() throws SQLException;
    //分页查询商品
}
