package xyz.omnia96.mall.paltfrom.api

import xyz.omnia96.mall.global_model.Response
import xyz.omnia96.mall.paltfrom.mapper.ShopsMapper
import xyz.omnia96.mall.paltfrom.model.Shop
import java.text.SimpleDateFormat

class Shops {
    fun all(shopsMapper: ShopsMapper):Response{
        val shops:Array<Shop> = shopsMapper.findShops()
        for (shop in shops){
            shop.create_time = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(shop.create_time)
        }
        return Response(200,"Request:ok",shops)
    }
    fun byName(shopsMapper: ShopsMapper,name:String):Response{
        val shops:Array<Shop> = shopsMapper.findShopsByName(name)
        for (shop in shops){
            shop.create_time = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(shop.create_time)
        }
        return Response(200,"Request:ok",shops)
    }
}