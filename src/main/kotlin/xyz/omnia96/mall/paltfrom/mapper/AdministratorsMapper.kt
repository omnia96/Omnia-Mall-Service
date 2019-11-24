package xyz.omnia96.mall.paltfrom.mapper

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import xyz.omnia96.mall.paltfrom.model.Administrators

@Mapper
interface AdministratorsMapper{
    @Select("select * from administrators where username = #{username}")
    fun findUserByUsername(@Param("username") username:String?):Administrators
}