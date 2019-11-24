package xyz.omnia96.mall.paltfrom.api

import xyz.omnia96.mall.global_model.Response
import xyz.omnia96.mall.paltfrom.mapper.ShopsMapper
import xyz.omnia96.mall.paltfrom.model.Shop
import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.logging.SimpleFormatter

class Shops {
    fun response(shopsMapper: ShopsMapper):Response{
        val shops:Array<Shop> = shopsMapper.findShops()
        for (shop in shops){
            shop.create_time = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(shop.create_time)
        }
        return Response(200,"Request:ok",shops)
    }
}