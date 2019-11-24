package xyz.omnia96.mall.paltfrom.controller

import net.bytebuddy.asm.Advice
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import xyz.omnia96.mall.global_model.Response
import xyz.omnia96.mall.paltfrom.api.Shops
import xyz.omnia96.mall.paltfrom.mapper.ShopsMapper
import javax.annotation.Resource

@RestController
class ShopsController {
    @Resource
    lateinit var shopsMapper:ShopsMapper
    @RequestMapping(path = ["/paltfrom/api/shops"],method = [RequestMethod.GET], produces = ["application/json"])
    fun shopController(@RequestParam name:String?):Response{
        val shops = Shops()
        if(name != null){
            val searchName:String =  '%' + name + '%'
            return  shops.byName(shopsMapper,searchName)
        }else{
            return  shops.all(shopsMapper)
        }
    }

}