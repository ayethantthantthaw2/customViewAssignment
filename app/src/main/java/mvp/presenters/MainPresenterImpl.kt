package mvp.presenters

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import mvp.views.MainView

class MainPresenterImpl:MainPresenter,ViewModel() {
    //View
    private var mView:MainView?=null
    override fun initView(view: MainView) {
        mView=view

    }

    override fun onUiReady(owner: LifecycleOwner) {

    }

    override fun onTapProfile() {
        mView?.navigateToProfile()
    }

    override fun onTapCreateTask() {
        mView?.navigateToCreateNewTask()
    }
}