package com.xsw.prj.servlet;

import com.alibaba.fastjson.JSON;
import com.xsw.prj.dao.RecyclebinDao;
import com.xsw.prj.po.Recyclebin;
import com.xsw.prj.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 如果出现404找不到Servlet，应该是没有配置servlet
 * 需要在类名前面加入注解    @WebServlet(name = "***Servlet",urlPatterns = {"/****Servlet"})
 *
 * 例如：@WebServlet(name = "RecycleServlet",urlPatterns = {"/RecycleServlet"})
 */
@WebServlet(name = "RecycleServlet",urlPatterns = {"/RecycleServlet"})
public class RecycleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration em = request.getParameterNames();

        while (em.hasMoreElements()) {
            String name = (String) em.nextElement();
            String value = request.getParameter(name);
            //System.out.println("name:"+name +"-- value:"+value);
        }

        response.setContentType("text/html; charset=UTF-8");

        String action = "query";
        if (request.getParameter("action") != null)
            action = request.getParameter("action");
        if ("query".equals(action)) {
            doQuery(request, response);
        }
        /*else
        if ("queryById".equals(action)) {
            doQueryById(request, response);
        }
        else  if ("add".equals(action)) {
            doAdd(request, response);
        }
        else  if ("update".equals(action)) {
            doUpdate(request, response);
        }
        else  if ("delete".equals(action)) {
            doDelete(request, response);
        }*/
    }

    public void doQuery(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html; charset=UTF-8");
        //1.根据参数,构造查询条件map
        Map<String,Object> condition   = new HashMap<String ,Object>();

        //1.1分页
        int startIndex  = 0;
        int pageSize  = 10;
        if(  request.getParameter("limit")!=null)
            pageSize = Integer.parseInt(   request.getParameter("limit") );

        int pageNo  = 1;
        if(  request.getParameter("page")!=null)
        {
            pageNo = Integer.parseInt(   request.getParameter("page") );
            startIndex = (pageNo-1)*pageSize;

            condition.put("startIndex", startIndex);
            condition.put("limit", pageSize);
        }

        //1.2 条件之  关键词
        String keyword  = request.getParameter("keyword");
        if( keyword!=null ){
            condition.put("keyword", keyword);
        }

        String result="";

        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        RecyclebinDao recyclebinDao = sqlSession.getMapper(RecyclebinDao.class);
        List<Recyclebin> list = recyclebinDao.getAllByPage(condition);

        String data = ""+ JSON.toJSON(list);

        int count = recyclebinDao.getCount(condition);
        //System.out.println("count:"+count);
        //sqlSession.commit();//切记：增删改操作时，要执行commit操作
        sqlSession.close();

        result+="{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\": " ;
        result+=  data;
        result+="}";


        System.out.println(result);
        PrintWriter pw = response.getWriter();
        String json = result;
        pw.println(json);
        pw.flush();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
