package joy.stuido.io.todo.model

import java.util.*

/**
 * Created by dhwoo on 2016. 6. 21..
 */

class Task(title: String, description: String) {
    private var id: String = UUID.randomUUID().toString();
    private var title: String = title
    private var description: String = description
    private var isCompleted: Boolean = false
}