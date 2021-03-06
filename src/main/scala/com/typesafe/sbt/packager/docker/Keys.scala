package com.typesafe.sbt
package packager
package docker

import sbt._

/**
 * Docker settings
 */
trait DockerKeys {
  val dockerGenerateConfig = TaskKey[File]("docker-generate-config", "Generates configuration file for Docker.")
  val dockerGenerateContext = TaskKey[File]("docker-generate-context", "Generates context directory for Docker.")
  val dockerPackageMappings = TaskKey[Seq[(File, String)]]("docker-package-mappings", "Generates location mappings for Docker build.")
  val dockerTarget = TaskKey[String]("docker-target", "Defines target used when building and publishing Docker image")

  val dockerBaseImage = SettingKey[String]("dockerBaseImage", "Base image for Dockerfile.")
  val dockerExposedPorts = SettingKey[Seq[Int]]("dockerExposedPorts", "Ports exposed by Docker image")
  val dockerExposedVolumes = SettingKey[Seq[String]]("dockerExposedVolumes", "Volumes exposed by Docker image")
  val dockerRepository = SettingKey[Option[String]]("dockerRepository", "Repository for published Docker image")
  val dockerUpdateLatest = SettingKey[Boolean]("dockerUpdateLatest", "Set to update latest tag")
}

