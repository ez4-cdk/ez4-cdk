import okhttp3.Interceptor
import okhttp3.Response

/**
 * @description 拦截器，用于添加cookie，保存cookie可以放在app全局变量中
 * @author delta
 * @date 2025/2/4 10:39
 */
internal class AddCookieInterceptor(
    private val cookie:String
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val origin = chain.request().newBuilder()
        origin.addHeader("Cookie",cookie)
        return chain.proceed(origin.build())
    }
}
