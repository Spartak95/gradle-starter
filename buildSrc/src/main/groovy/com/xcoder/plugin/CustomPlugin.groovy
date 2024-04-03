package com.xcoder.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        def map = ["description": "Hello task", "group": "xcoder", "type": DefaultTask]

        project.task(map, "hello") {
            println "Configuration phase."
            println "task: $description, group: $group, actions: ${actions.size()}"

            doLast {
                println "execution phase, Action1"
            }

            doFirst {
                println "execution phase, Action2"
            }

            doLast {
                println "execution phase, Action3"
            }

            println "task: $description, group: $group, actions: ${actions.size()}"
            println "path task: ${path}"
        }
    }
}
