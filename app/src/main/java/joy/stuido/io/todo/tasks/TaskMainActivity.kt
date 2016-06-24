package joy.stuido.io.todo.tasks

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import joy.stuido.io.todo.R

class TaskMainActivity : AppCompatActivity() {
    var tasksPresent: TasksPresentImpl? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_main)

        var tasksFragment = supportFragmentManager.findFragmentById(R.id.contentFrame) ?: TasksFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.contentFrame, tasksFragment)
        transaction.commit()

        // Create the presenter
        tasksPresent = TasksPresentImpl()
    }
}
