package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.mvp.views

import com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.NewsVO

interface NewsDetailsView {
    fun displayNewsDetails(news: NewsVO)
}