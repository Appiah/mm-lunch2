package models

import play.api.libs.json._
import play.api.libs.functional.syntax._
import models.JsonFormats._

case class User(id: Int, fullname: String, lunchName: String, active:Boolean)

object JsonFormats{
    implicit val userReads = Json.reads[User]

    implicit val userWrites = Json.writes[User]

}
/*case class User( id: Int,
                 fullName: String,
                 lunchName: String,
                 active: Boolean)

object JsonFormats {
  import play.api.libs.json._

  // Generates Writes and Reads for Feed and User thanks to Json Macros
  implicit object UserFormat extends Format[User] {
      def reads(json: JsValue): User = User(
          (json \ "id").as[Int],
          (json \ "fullName").as[String],
          (json \ "lunchName").as[String],
          (json \ "active").as[Boolean]
      )
      
      def writes(user: User) = JsObject(List(
          "id" -> JsNumber(user.id),
          "fullName" -> JsString(user.fullName),
          "lunchName" -> JsString(user.lunchName),
          "active" -> JsBoolean(user.active))) 
  }
}*/