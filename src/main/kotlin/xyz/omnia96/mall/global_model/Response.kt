package xyz.omnia96.mall.global_model

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

data class Response(var statusCode:Int,var message:String,var data:Any)