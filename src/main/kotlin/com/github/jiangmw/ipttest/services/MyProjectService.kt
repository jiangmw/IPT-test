package com.github.jiangmw.ipttest.services

import com.github.jiangmw.ipttest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
