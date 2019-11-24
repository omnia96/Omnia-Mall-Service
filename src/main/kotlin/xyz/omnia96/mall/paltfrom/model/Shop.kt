package xyz.omnia96.mall.paltfrom.model

import java.sql.Date
import java.sql.Time
import java.sql.Timestamp
import java.time.format.DateTimeFormatter

data class Shop(var id:Int,var name:String,var logo:String?,var site:String?,var address:String?,var location:String?,var create_time:Any,var contact_number:String?){

}