package com.wupj.cloud.com;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * pre：路由之前
 * routing：路由之时
 * post： 路由之后
 * error：发送错误调用
 * filterOrder：过滤的顺序
 * shouldFilter：这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
 * run：过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
 * @author WPJ587
 */
@Component
public class MyFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        Object token = request.getParameter("token");
        /**
         * 此处可以进行自定义的一些验证，我觉的黑名单这类的就可以在这边做，如果能够动态改变的话，
         * 那就可以在被攻击的时候临时屏蔽掉一些请求（感觉可以使用lua脚本试试，虽然我不会写）
         */
       /* if (token ==null){
            try {
                requestContext.setSendZuulResponse(false);
                requestContext.setResponseStatusCode(401);
                requestContext.getResponse().getWriter().write("token is empty!");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }*/
        return null;
    }
}