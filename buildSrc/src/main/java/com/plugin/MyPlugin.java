package com.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Created by fucong on 2023/4/13
 * Usage:
 * Doc:
 */
public class MyPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        for (int i = 0; i < 10; i++) {
            project.task("task_" + i);
        }
    }
}
