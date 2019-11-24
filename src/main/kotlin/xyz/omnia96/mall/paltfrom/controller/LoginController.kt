package xyz.omnia96.mall.paltfrom.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import xyz.omnia96.mall.paltfrom.api.Login
import xyz.omnia96.mall.paltfrom.mapper.AdministratorsMapper
import xyz.omnia96.mall.global_model.Response
import javax.annotation.Resource
@RestController
class LoginController {
    @Resource
    lateinit var administratorsMapper: AdministratorsMapper
    @RequestMapping(path = ["/paltfrom/api/login"],method = [RequestMethod.POST], produces = ["application/json"])
    fun loginController(@RequestParam username:String,@RequestParam password: String): Response {
        val login = Login()
        return login.response(username, password,administratorsMapper)
    }
}