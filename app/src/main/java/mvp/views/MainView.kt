package mvp.views

import com.example.customviewassignment.mvp.views.BaseView

interface MainView:BaseView {
    fun navigateToCreateNewTask()
    fun navigateToProfile()
}