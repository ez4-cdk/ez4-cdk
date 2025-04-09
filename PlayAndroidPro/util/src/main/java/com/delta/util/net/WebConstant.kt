package com.delta.util.net

/**
 * @description 网络请求常量
 * @author delta
 * @date 2025/2/4 10:07
 */
object WebConstant {
    const val BASE_URL = "https://www.wanandroid.com"

    object collectAPI {  // 收藏相关
        const val API_GET_COLLECTED_WEBS = "/lg/collect/usertools/json"
        const val API_GET_COLLECTED_ARTICLES = "/lg/collect/list/{page}/json"
        const val API_COLLECT_ARTICLE = "/lg/collect/{id}/json"
        const val API_COLLECT_WEBSITE = "/lg/collect/addtool/json"
        const val API_COLLECT_OUTSIDE_ARTICLE = "/lg/collect/add/json"
        const val API_DISCOLLECT_ARTICLE = "/lg/uncollect/{id}/json"
        const val API_DISCOLLECT_WEBSITE = "/lg/collect/deletetool/json"
        const val API_EDIT_COLLECTED_ARTICLES = "/lg/collect/user_article/update/{id}/json"
        const val API_EDIT_COLLECTED_WEBSITE = "/lg/collect/updatetool/json"
    }

    object hamonyAPI {   // 鸿蒙相关
        const val API_GET_HARMONY_COLUMN = "/harmony/index/json"
        const val API_GET_ASK_AND_ANSWER = "/popular/wenda/json"
        const val API_GET_POPULAR_COLUMN = "/popular/column/json"
        const val API_GET_POPULAR_ROUTE = "/popular/route/json"
    }

    object homeAPI {
        const val API_GET_HOME_BANNER = "/banner/json"
        const val API_GET_HOME_ARTICLE = "/article/list/{page}/json"
        const val API_GET_HOME_WEBSITE = "/friend/json"
        const val API_HOME_COLLECT_ARTICLE = "/lg/collect/{id}/json"
        const val API_HOME_DISCOLLECT_ARTICLE = "/lg/uncollect_originId/{id}/json"
    }

    object loginAPI {
        const val API_LOGIN = "/user/login"
        const val API_REGISTER = "/user/register"
        const val API_LOGOUT = "/user/logout/json"
    }

    object projectAPI {
        const val API_GET_PROJECT_LIST = "/project/tree/json"
        const val API_GET_PROJECT_ARTICLE = "/project/list/{page}/json"
    }

    object searchAPI {
        const val API_GET_HOTKEY = "/hotkey/json"
        const val API_GET_SEARCH_RESULT = "/article/query/{page}/json"
        const val API_COLLECT_SEARCH_RESULT = "/lg/collect/{id}/json"
        const val API_DISCOLLECT_SEARCH_RESULT = "/lg/uncollect_originId/{id}/json"
    }

    object systemAPI {
        const val API_GET_SYSTEM_DATA = "/tree/json"
        const val API_GET_SYSTEM_ARTICLE = "/article/list/{page}/json"
        const val API_GET_ARTICLE_BY_AUTHOR = "/article/list/{page}/json"
        const val API_COLLECT_ARTICLE = "/lg/collect/{id}/json"
        const val API_DISCOLLECT_ARTICLE = "/lg/uncollect_originId/{id}/json"
    }


    object coinAPI{
        const val API_GET_MY_INFO = "/lg/coin/userinfo/json"
        const val API_GET_MY_DETAIL_INFO = "/lg/coin/list/{page}/json"
    }
}