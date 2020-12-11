// @GENERATOR:play-routes-compiler
// @SOURCE:/home/sachin/data/play-scala-scheduler-example/conf/routes
// @DATE:Sun Nov 08 16:42:26 IST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
