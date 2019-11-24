package xyz.omnia96.mall.paltfrom.api

import xyz.omnia96.mall.paltfrom.mapper.AdministratorsMapper
import xyz.omnia96.mall.paltfrom.model.Administrators
import xyz.omnia96.mall.paltfrom.model.Response

class Login {
    fun response(username: String, password: String, administratorsMapper: AdministratorsMapper):Response{
        val administratorIs:Administrators? = administratorsMapper.findUserByUsername(username)
        if (administratorIs == null){
            return Response(200,"Request:ok","用户不存在")
        }else if (administratorIs.password != password){
            return Response(200,"Request:ok","密码错误")
        }
        else{
            return Response(200,"Request:ok", mapOf("id" to administratorIs.id))
        }
    }
}