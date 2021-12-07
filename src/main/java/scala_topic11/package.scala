import scala_topic11.Scala05_Tranform.User

package object scala_topic11 {
  implicit class UserExt(user: User){
    def updateUser():Unit={
      println("update user...")
    }
  }
}
