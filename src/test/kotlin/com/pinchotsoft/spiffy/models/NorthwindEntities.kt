package com.pinchotsoft.spiffy.models

import java.math.BigDecimal
import java.sql.Timestamp

data class Order(
    var orderId: Int,
    var customerID: String?,
    var employeeId: Int?,
    var orderDate: Timestamp?,
    var requiredDate: Timestamp?,
    var shippedDate: Timestamp?,
    var shipVia: Int?,
    var shipName: String?,
    var shipAddress: String?,
    var shipCity: String?,
    var shipRegion: String?,
    var shipPostalCode: String?,
    var shipCountry: String?,
    var freight: BigDecimal?)

class OrderPojo {
    var orderId: Int = 0
    var customerID: String? = ""
    var employeeId: Int? = null
    var orderDate: Timestamp? = null
    var requiredDate: Timestamp? = null
    var shippedDate: Timestamp? = null
    var shipVia: Int? = null
    var shipName: String? = null
    var shipAddress: String? = null
    var shipCity: String? = null
    var shipRegion: String? = null
    var shipPostalCode: String? = null
    var shipCountry: String? = null
    var freight: BigDecimal? = null
}