package joy.stuido.io.todo.tasks

import joy.stuido.io.todo.base.BaseView
import joy.stuido.io.todo.model.Task

/**
 * Created by dhwoo on 2016. 6. 24..
 */

interface TasksView : BaseView<TasksPresent> {
    val isActive: Boolean

    abstract fun setLoadingIndicator(active: Boolean)

    abstract fun showTasks(tasks: List<Task>)

    abstract fun showAddTask()

    abstract fun showTaskDetailsUi(taskId: String)

    abstract fun showTaskMarkedComplete()

    abstract fun showTaskMarkedActive()

    abstract fun showCompletedTasksCleared()

    abstract fun showLoadingTasksError()

    abstract fun showNoTasks()

    abstract fun showActiveFilterLabel()

    abstract fun showCompletedFilterLabel()

    abstract fun showAllFilterLabel()

    abstract fun showNoActiveTasks()

    abstract fun showNoCompletedTasks()

    abstract fun showSuccessfullySavedMessage()

    abstract fun showFilteringPopUpMenu()
}