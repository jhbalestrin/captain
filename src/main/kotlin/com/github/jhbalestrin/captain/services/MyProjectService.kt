package com.github.jhbalestrin.captain.services

import com.github.jhbalestrin.captain.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
