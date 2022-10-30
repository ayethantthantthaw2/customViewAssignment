package mvp.presenters

import com.attt.customviewsassignment.delegates.ProfileDelegate
import mvp.views.MainView

interface MainPresenter:BasePresenter,ProfileDelegate {
    fun initView(view:MainView)

}