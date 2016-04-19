import java.io.File
import java.net.URL

import play.api.Mode.Mode
import play.api.{Environment, LoggerConfigurator}

class CustomLoggerConfigurator extends LoggerConfigurator {
  override def init(rootPath: File, mode: Mode): Unit = ???

  override def shutdown(): Unit = ???

  override def configure(env: Environment): Unit = ???

  override def configure(properties: Map[String, String], config: Option[URL]): Unit = ???
}
