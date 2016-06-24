package joy.stuido.io.todo.tasks

import joy.stuido.io.todo.base.BasePresenter
import joy.stuido.io.todo.model.Task

/**
 * Created by dhwoo on 2016. 6. 23..
 */

interface TasksPresent : BasePresenter {
    abstract fun result(requestCode: Int, resultCode: Int)

    abstract fun loadTasks(forceUpdate: Boolean)

    abstract fun addNewTask()

    abstract fun openTaskDetails(requestedTask: Task)

    abstract fun completeTask(completedTask: Task)

    abstract fun activateTask(activeTask: Task)

    abstract fun clearCompletedTasks()

//    abstract fun setFiltering(requestType: TasksFilterType)
//
//    abstract fun getFiltering(): TasksFilterType
}
