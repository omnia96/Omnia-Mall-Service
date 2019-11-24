package xyz.omnia96.mall.paltfrom.mapper

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import xyz.omnia96.mall.paltfrom.model.Shop

@Mapper
interface ShopsMapper {
    @Select("select * from shops")
    fun findShops():Array<Shop>
    @Select("select * from shops where name like #{name}")
    fun findShopsByName(@Param("name")name:String):Array<Shop>
}