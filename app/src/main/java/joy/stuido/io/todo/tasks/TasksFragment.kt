package joy.stuido.io.todo.tasks

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import joy.stuido.io.todo.R
import joy.stuido.io.todo.model.Task

/**
 * Created by dhwoo on 2016. 6. 23..
 */

class TasksFragment : Fragment(), TasksView {
    override val isActive: Boolean
        get() = throw UnsupportedOperationException()

    override fun setLoadingIndicator(active: Boolean) {
        throw UnsupportedOperationException()
    }

    override fun showTasks(tasks: List<Task>) {
        throw UnsupportedOperationException()
    }

    override fun showAddTask() {
        throw UnsupportedOperationException()
    }

    override fun showTaskDetailsUi(taskId: String) {
        throw UnsupportedOperationException()
    }

    override fun showTaskMarkedComplete() {
        throw UnsupportedOperationException()
    }

    override fun showTaskMarkedActive() {
        throw UnsupportedOperationException()
    }

    override fun showCompletedTasksCleared() {
        throw UnsupportedOperationException()
    }

    override fun showLoadingTasksError() {
        throw UnsupportedOperationException()
    }

    override fun showNoTasks() {
        throw UnsupportedOperationException()
    }

    override fun showActiveFilterLabel() {
        throw UnsupportedOperationException()
    }

    override fun showCompletedFilterLabel() {
        throw UnsupportedOperationException()
    }

    override fun showAllFilterLabel() {
        throw UnsupportedOperationException()
    }

    override fun showNoActiveTasks() {
        throw UnsupportedOperationException()
    }

    override fun showNoCompletedTasks() {
        throw UnsupportedOperationException()
    }

    override fun showSuccessfullySavedMessage() {
        throw UnsupportedOperationException()
    }

    override fun showFilteringPopUpMenu() {
        throw UnsupportedOperationException()
    }

    override fun setPresenter(presenter: TasksPresent) {
        throw UnsupportedOperationException()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater?.inflate(R.layout.fragemnt_tasks_list, container, false)

        return root
    }
}
