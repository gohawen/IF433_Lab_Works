package oop_00000114726_Kurniawan.week08

class City(val name: String)
class Address(val city: City?)
class DeliveryDetails(val address: Address?)
class order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)