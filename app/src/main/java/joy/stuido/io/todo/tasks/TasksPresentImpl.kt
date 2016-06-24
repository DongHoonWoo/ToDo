package joy.stuido.io.todo.tasks

import joy.stuido.io.todo.model.Task

/**
 * Created by dhwoo on 2016. 6. 23..
 */
class TasksPresentImpl : TasksPresent {
    override fun loadTasks(forceUpdate: Boolean) {
        throw UnsupportedOperationException()
    }

    override fun addNewTask() {
        throw UnsupportedOperationException()
    }

    override fun openTaskDetails(requestedTask: Task) {
        throw UnsupportedOperationException()
    }

    override fun completeTask(completedTask: Task) {
        throw UnsupportedOperationException()
    }

    override fun activateTask(activeTask: Task) {
        throw UnsupportedOperationException()
    }

    override fun clearCompletedTasks() {
        throw UnsupportedOperationException()
    }

    init {

    }

    override fun result(requestCode: Int, resultCode: Int) {
        throw UnsupportedOperationException()
    }

    override fun start() {
        throw UnsupportedOperationException()
    }

}