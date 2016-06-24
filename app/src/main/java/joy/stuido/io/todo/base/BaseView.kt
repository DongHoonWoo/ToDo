package joy.stuido.io.todo.base

/**
 * Created by dhwoo on 2016. 6. 24..
 */

interface BaseView<T> {
    abstract fun setPresenter(presenter: T)
}
