package com.github.xuhongyuan2014.demoidea.services

import com.github.xuhongyuan2014.demoidea.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
