import scala.language.postfixOps

val i = -1 toChar

val stream = "1,3,4,5,Not Number,7,8,9,Hello World,$,%" split "," toStream