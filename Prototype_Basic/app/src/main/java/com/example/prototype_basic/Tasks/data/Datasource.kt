package com.example.prototype_basic.Tasks.data

import com.example.prototype_basic.Tasks.model.Task

class Datasource {
    val tasks = mutableListOf<Task>()

    fun add(title: String) {
        val task = Task(title)
        this.tasks.add(task)
    }

    fun delete(index: Int) {
        this.tasks.removeAt(index)
    }
}